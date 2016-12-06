package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class ConferencePaperCodeFAOSTATIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperCodeFAOSTATIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperCodeFAOSTATIterator.class);

	String subjectURI = null;
	String codeFAOSTAT = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			ConferencePaper ancestorInstance = (ConferencePaper) findAncestorWithClass(this, ConferencePaper.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://aims.fao.org/aos/geopolitical.owl#codeFAOSTAT> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				codeFAOSTAT = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in ConferencePaperIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in ConferencePaperIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				codeFAOSTAT = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in ConferencePaperIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in ConferencePaperIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in ConferencePaper doEndTag", e);
			throw new JspTagException("Exception raised in ConferencePaper doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setCodeFAOSTAT(String codeFAOSTAT) {
		this.codeFAOSTAT = codeFAOSTAT;
	}

	public String getCodeFAOSTAT() {
		return codeFAOSTAT;
	}

}
