package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class BookCodeFAOTERMIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookCodeFAOTERMIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(BookCodeFAOTERMIterator.class);

	String subjectURI = null;
	String codeFAOTERM = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			Book ancestorInstance = (Book) findAncestorWithClass(this, Book.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://aims.fao.org/aos/geopolitical.owl#codeFAOTERM> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				codeFAOTERM = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in BookIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in BookIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				codeFAOTERM = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in BookIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in BookIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in Book doEndTag", e);
			throw new JspTagException("Exception raised in Book doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setCodeFAOTERM(String codeFAOTERM) {
		this.codeFAOTERM = codeFAOTERM;
	}

	public String getCodeFAOTERM() {
		return codeFAOTERM;
	}

}
