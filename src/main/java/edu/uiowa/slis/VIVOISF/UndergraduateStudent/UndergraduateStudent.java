package edu.uiowa.slis.VIVOISF.UndergraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class UndergraduateStudent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UndergraduateStudent currentInstance = null;
	private static final Log log = LogFactory.getLog(UndergraduateStudent.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;
	String teachingOverview = null;
	String outreachOverview = null;
	String researchOverview = null;
	String overview = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			UndergraduateStudentIterator theUndergraduateStudentIterator = (UndergraduateStudentIterator) findAncestorWithClass(this, UndergraduateStudentIterator.class);

			if (theUndergraduateStudentIterator != null) {
				subjectURI = theUndergraduateStudentIterator.getSubjectURI();
				label = theUndergraduateStudentIterator.getLabel();
			}

			if (theUndergraduateStudentIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(Prefix_1_4
				+ " SELECT ?label  ?teachingOverview ?outreachOverview ?researchOverview ?overview where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://vivoweb.org/ontology/core#teachingOverview> ?teachingOverview } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://vivoweb.org/ontology/core#outreachOverview> ?outreachOverview } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://vivoweb.org/ontology/core#researchOverview> ?researchOverview } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://vivoweb.org/ontology/core#overview> ?overview } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").toString();
					teachingOverview = sol.get("?teachingOverview") == null ? null : sol.get("?teachingOverview").toString();
					outreachOverview = sol.get("?outreachOverview") == null ? null : sol.get("?outreachOverview").toString();
					researchOverview = sol.get("?researchOverview") == null ? null : sol.get("?researchOverview").toString();
					overview = sol.get("?overview") == null ? null : sol.get("?overview").toString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in UndergraduateStudent doStartTag", e);
			throw new JspTagException("Exception raised in UndergraduateStudent doStartTag");
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
			log.error("Exception raised in UndergraduateStudent doEndTag", e);
			throw new JspTagException("Exception raised in UndergraduateStudent doEndTag");
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

	public void setTeachingOverview(String teachingOverview) {
		this.teachingOverview = teachingOverview;
	}

	public String getTeachingOverview() {
		return teachingOverview;
	}

	public void setOutreachOverview(String outreachOverview) {
		this.outreachOverview = outreachOverview;
	}

	public String getOutreachOverview() {
		return outreachOverview;
	}

	public void setResearchOverview(String researchOverview) {
		this.researchOverview = researchOverview;
	}

	public String getResearchOverview() {
		return researchOverview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public String getOverview() {
		return overview;
	}

}
