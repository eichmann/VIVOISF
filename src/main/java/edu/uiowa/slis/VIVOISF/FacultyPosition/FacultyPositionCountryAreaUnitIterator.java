package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class FacultyPositionCountryAreaUnitIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionCountryAreaUnitIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionCountryAreaUnitIterator.class);

	String subjectURI = null;
	String countryAreaUnit = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			FacultyPosition ancestorInstance = (FacultyPosition) findAncestorWithClass(this, FacultyPosition.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://aims.fao.org/aos/geopolitical.owl#countryAreaUnit> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				countryAreaUnit = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in FacultyPositionIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in FacultyPositionIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				countryAreaUnit = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in FacultyPositionIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in FacultyPositionIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in FacultyPosition doEndTag", e);
			throw new JspTagException("Exception raised in FacultyPosition doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setCountryAreaUnit(String countryAreaUnit) {
		this.countryAreaUnit = countryAreaUnit;
	}

	public String getCountryAreaUnit() {
		return countryAreaUnit;
	}

}
