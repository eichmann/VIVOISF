package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class DateTimeValueHasMaxLatitudeIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueHasMaxLatitudeIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueHasMaxLatitudeIterator.class);

	String subjectURI = null;
	String hasMaxLatitude = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			DateTimeValue ancestorInstance = (DateTimeValue) findAncestorWithClass(this, DateTimeValue.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://aims.fao.org/aos/geopolitical.owl#hasMaxLatitude> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				hasMaxLatitude = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in DateTimeValueIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in DateTimeValueIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				hasMaxLatitude = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in DateTimeValueIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in DateTimeValueIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in DateTimeValue doEndTag", e);
			throw new JspTagException("Exception raised in DateTimeValue doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setHasMaxLatitude(String hasMaxLatitude) {
		this.hasMaxLatitude = hasMaxLatitude;
	}

	public String getHasMaxLatitude() {
		return hasMaxLatitude;
	}

}
