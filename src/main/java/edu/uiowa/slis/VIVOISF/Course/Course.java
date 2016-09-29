package edu.uiowa.slis.VIVOISF.Course;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Course extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Course currentInstance = null;
	private static final Log log = LogFactory.getLog(Course.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			CourseIterator theCourseIterator = (CourseIterator) findAncestorWithClass(this, CourseIterator.class);

			if (theCourseIterator != null) {
				subjectURI = theCourseIterator.getSubjectURI();
				label = theCourseIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Course.CourseHasPrerequisiteIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Course.CourseHasPrerequisiteIterator)this.getParent()).getHasPrerequisite();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Course.CoursePrerequisiteForIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Course.CoursePrerequisiteForIterator)this.getParent()).getPrerequisiteFor();
			}

			edu.uiowa.slis.VIVOISF.Course.CourseHasPrerequisiteIterator theCourseHasPrerequisiteIterator = (edu.uiowa.slis.VIVOISF.Course.CourseHasPrerequisiteIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Course.CourseHasPrerequisiteIterator.class);

			if (subjectURI == null && theCourseHasPrerequisiteIterator != null) {
				subjectURI = theCourseHasPrerequisiteIterator.getHasPrerequisite();
			}

			edu.uiowa.slis.VIVOISF.Course.CoursePrerequisiteForIterator theCoursePrerequisiteForIterator = (edu.uiowa.slis.VIVOISF.Course.CoursePrerequisiteForIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Course.CoursePrerequisiteForIterator.class);

			if (subjectURI == null && theCoursePrerequisiteForIterator != null) {
				subjectURI = theCoursePrerequisiteForIterator.getPrerequisiteFor();
			}

			if (theCourseIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?label ?foafName ?rdfValue  where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?foafName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#value> ?rdfValue } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
					if (label == null)
						label = sol.get("?foafName") == null ? null : sol.get("?foafName").asLiteral().getString();
					if (label == null)
						label = sol.get("?rdfValue") == null ? null : sol.get("?rdfValue").asLiteral().getString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in Course doStartTag", e);
			throw new JspTagException("Exception raised in Course doStartTag");
		} finally {
			freeConnection();
		}

		return EVAL_PAGE;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in Course doEndTag", e);
			throw new JspTagException("Exception raised in Course doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setSubjectURI(String subjectURI) {
		this.subjectURI = subjectURI;
	}

	public String getSubjectURI() {
		return subjectURI;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

}
