package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionPopulationYearIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionPopulationYearIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionPopulationYearIterator.class);

	String subjectURI = null;
	String populationYear = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			FacultyAdministrativePosition ancestorInstance = (FacultyAdministrativePosition) findAncestorWithClass(this, FacultyAdministrativePosition.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://aims.fao.org/aos/geopolitical.owl#populationYear> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				populationYear = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in FacultyAdministrativePositionIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in FacultyAdministrativePositionIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				populationYear = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in FacultyAdministrativePositionIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in FacultyAdministrativePositionIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in FacultyAdministrativePosition doEndTag", e);
			throw new JspTagException("Exception raised in FacultyAdministrativePosition doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setPopulationYear(String populationYear) {
		this.populationYear = populationYear;
	}

	public String getPopulationYear() {
		return populationYear;
	}

}
