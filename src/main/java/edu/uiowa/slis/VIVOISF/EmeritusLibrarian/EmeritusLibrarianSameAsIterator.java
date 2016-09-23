package edu.uiowa.slis.VIVOISF.EmeritusLibrarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class EmeritusLibrarianSameAsIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusLibrarianSameAsIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusLibrarianSameAsIterator.class);

	String subjectURI = null;
	String sameAs = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			EmeritusLibrarian ancestorInstance = (EmeritusLibrarian) findAncestorWithClass(this, EmeritusLibrarian.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://www.w3.org/2002/07/owl#sameAs> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				sameAs = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in EmeritusLibrarianIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in EmeritusLibrarianIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				sameAs = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in EmeritusLibrarianIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in EmeritusLibrarianIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in EmeritusLibrarian doEndTag", e);
			throw new JspTagException("Exception raised in EmeritusLibrarian doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setSameAs(String sameAs) {
		this.sameAs = sameAs;
	}

	public String getSameAs() {
		return sameAs;
	}

}
