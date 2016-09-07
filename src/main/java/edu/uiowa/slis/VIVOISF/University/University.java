package edu.uiowa.slis.VIVOISF.University;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class University extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static University currentInstance = null;
	private static final Log log = LogFactory.getLog(University.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;
	String overview = null;
	String abbreviation = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			UniversityIterator theUniversityIterator = (UniversityIterator) findAncestorWithClass(this, UniversityIterator.class);

			if (theUniversityIterator != null) {
				subjectURI = theUniversityIterator.getSubjectURI();
				label = theUniversityIterator.getLabel();
			}

			if (theUniversityIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(Prefix_1_4
				+ " SELECT ?label  ?overview ?abbreviation where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://vivoweb.org/ontology/core#overview> ?overview } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://vivoweb.org/ontology/core#abbreviation> ?abbreviation } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
					overview = sol.get("?overview") == null ? null : sol.get("?overview").toString();
					abbreviation = sol.get("?abbreviation") == null ? null : sol.get("?abbreviation").toString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in University doStartTag", e);
			throw new JspTagException("Exception raised in University doStartTag");
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
			log.error("Exception raised in University doEndTag", e);
			throw new JspTagException("Exception raised in University doEndTag");
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

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

}
