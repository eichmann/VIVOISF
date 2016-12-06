package edu.uiowa.slis.VIVOISF.BFO_0000017;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class BFO_0000017CodeGAULIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000017CodeGAULIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000017CodeGAULIterator.class);

	String subjectURI = null;
	String codeGAUL = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			BFO_0000017 ancestorInstance = (BFO_0000017) findAncestorWithClass(this, BFO_0000017.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://aims.fao.org/aos/geopolitical.owl#codeGAUL> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				codeGAUL = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in BFO_0000017Iterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in BFO_0000017Iterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				codeGAUL = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in BFO_0000017Iterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in BFO_0000017Iterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in BFO_0000017 doEndTag", e);
			throw new JspTagException("Exception raised in BFO_0000017 doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setCodeGAUL(String codeGAUL) {
		this.codeGAUL = codeGAUL;
	}

	public String getCodeGAUL() {
		return codeGAUL;
	}

}