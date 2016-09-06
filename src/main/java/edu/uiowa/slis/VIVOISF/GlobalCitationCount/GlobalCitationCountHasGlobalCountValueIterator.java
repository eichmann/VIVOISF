package edu.uiowa.slis.VIVOISF.GlobalCitationCount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class GlobalCitationCountHasGlobalCountValueIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GlobalCitationCountHasGlobalCountValueIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(GlobalCitationCountHasGlobalCountValueIterator.class);

	String subjectURI = null;
	String hasGlobalCountValue = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			GlobalCitationCount ancestorInstance = (GlobalCitationCount) findAncestorWithClass(this, GlobalCitationCount.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(Prefix_1_4+"SELECT ?s where { <" + subjectURI + "> <http://purl.org/spar/c4o/hasGlobalCountValue> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				hasGlobalCountValue = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in GlobalCitationCountIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in GlobalCitationCountIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				hasGlobalCountValue = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in GlobalCitationCountIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in GlobalCitationCountIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in GlobalCitationCount doEndTag", e);
			throw new JspTagException("Exception raised in GlobalCitationCount doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setHasGlobalCountValue(String hasGlobalCountValue) {
		this.hasGlobalCountValue = hasGlobalCountValue;
	}

	public String getHasGlobalCountValue() {
		return hasGlobalCountValue;
	}

}
