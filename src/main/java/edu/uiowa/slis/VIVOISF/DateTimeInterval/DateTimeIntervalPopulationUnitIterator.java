package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class DateTimeIntervalPopulationUnitIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalPopulationUnitIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalPopulationUnitIterator.class);

	String subjectURI = null;
	String populationUnit = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			DateTimeInterval ancestorInstance = (DateTimeInterval) findAncestorWithClass(this, DateTimeInterval.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://aims.fao.org/aos/geopolitical.owl#populationUnit> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				populationUnit = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in DateTimeIntervalIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in DateTimeIntervalIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				populationUnit = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in DateTimeIntervalIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in DateTimeIntervalIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in DateTimeInterval doEndTag", e);
			throw new JspTagException("Exception raised in DateTimeInterval doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setPopulationUnit(String populationUnit) {
		this.populationUnit = populationUnit;
	}

	public String getPopulationUnit() {
		return populationUnit;
	}

}
