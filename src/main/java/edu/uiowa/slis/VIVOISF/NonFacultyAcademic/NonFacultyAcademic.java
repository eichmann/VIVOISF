package edu.uiowa.slis.VIVOISF.NonFacultyAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class NonFacultyAcademic extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademic currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademic.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;
	String overview = null;
	String teachingOverview = null;
	String outreachOverview = null;
	String researchOverview = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			NonFacultyAcademicIterator theNonFacultyAcademicIterator = (NonFacultyAcademicIterator) findAncestorWithClass(this, NonFacultyAcademicIterator.class);

			if (theNonFacultyAcademicIterator != null) {
				subjectURI = theNonFacultyAcademicIterator.getSubjectURI();
				label = theNonFacultyAcademicIterator.getLabel();
			}

			if (theNonFacultyAcademicIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(Prefix_1_4
				+ " SELECT ?label  ?overview ?teachingOverview ?outreachOverview ?researchOverview where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://vivoweb.org/ontology/core#overview> ?overview } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://vivoweb.org/ontology/core#teachingOverview> ?teachingOverview } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://vivoweb.org/ontology/core#outreachOverview> ?outreachOverview } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://vivoweb.org/ontology/core#researchOverview> ?researchOverview } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
					overview = sol.get("?overview") == null ? null : sol.get("?overview").toString();
					teachingOverview = sol.get("?teachingOverview") == null ? null : sol.get("?teachingOverview").toString();
					outreachOverview = sol.get("?outreachOverview") == null ? null : sol.get("?outreachOverview").toString();
					researchOverview = sol.get("?researchOverview") == null ? null : sol.get("?researchOverview").toString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in NonFacultyAcademic doStartTag", e);
			throw new JspTagException("Exception raised in NonFacultyAcademic doStartTag");
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
			log.error("Exception raised in NonFacultyAcademic doEndTag", e);
			throw new JspTagException("Exception raised in NonFacultyAcademic doEndTag");
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

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public String getOverview() {
		return overview;
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

}
