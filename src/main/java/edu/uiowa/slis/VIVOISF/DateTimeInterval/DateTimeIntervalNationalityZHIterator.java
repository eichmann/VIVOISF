package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class DateTimeIntervalNationalityZHIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalNationalityZHIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalNationalityZHIterator.class);

	String subjectURI = null;
	String nationalityZH = null;
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

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://aims.fao.org/aos/geopolitical.owl#nationalityZH> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				nationalityZH = sol.get("?s").toString();
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
				nationalityZH = sol.get("?s").toString();
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

	public void setNationalityZH(String nationalityZH) {
		this.nationalityZH = nationalityZH;
	}

	public String getNationalityZH() {
		return nationalityZH;
	}

}
