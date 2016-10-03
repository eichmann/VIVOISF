package edu.uiowa.slis.VIVOISF.disputed;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class disputedHasStatisticsIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static disputedHasStatisticsIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(disputedHasStatisticsIterator.class);

	String subjectURI = null;
	String hasStatistics = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			disputed ancestorInstance = (disputed) findAncestorWithClass(this, disputed.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://aims.fao.org/aos/geopolitical.owl#hasStatistics> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				hasStatistics = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in disputedIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in disputedIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				hasStatistics = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in disputedIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in disputedIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in disputed doEndTag", e);
			throw new JspTagException("Exception raised in disputed doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setHasStatistics(String hasStatistics) {
		this.hasStatistics = hasStatistics;
	}

	public String getHasStatistics() {
		return hasStatistics;
	}

}