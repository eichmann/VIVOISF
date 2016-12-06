package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class ConferenceCodeAGROVOCIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceCodeAGROVOCIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceCodeAGROVOCIterator.class);

	String subjectURI = null;
	String codeAGROVOC = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			Conference ancestorInstance = (Conference) findAncestorWithClass(this, Conference.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://aims.fao.org/aos/geopolitical.owl#codeAGROVOC> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				codeAGROVOC = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in ConferenceIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in ConferenceIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				codeAGROVOC = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in ConferenceIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in ConferenceIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in Conference doEndTag", e);
			throw new JspTagException("Exception raised in Conference doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setCodeAGROVOC(String codeAGROVOC) {
		this.codeAGROVOC = codeAGROVOC;
	}

	public String getCodeAGROVOC() {
		return codeAGROVOC;
	}

}
