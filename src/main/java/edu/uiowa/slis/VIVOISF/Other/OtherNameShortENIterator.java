package edu.uiowa.slis.VIVOISF.Other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class OtherNameShortENIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OtherNameShortENIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(OtherNameShortENIterator.class);

	static boolean firstInstance = false;
	static boolean lastInstance = false;

	String subjectURI = null;
	String nameShortEN = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			Other ancestorInstance = (Other) findAncestorWithClass(this, Other.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://aims.fao.org/aos/geopolitical.owl#nameShortEN> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				nameShortEN = sol.get("?s").isLiteral() ? sol.get("?s").asLiteral().getString() : sol.get("?s").toString();
				firstInstance = true;
				lastInstance = ! rs.hasNext();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in OtherIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in OtherIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				nameShortEN = sol.get("?s").isLiteral() ? sol.get("?s").asLiteral().getString() : sol.get("?s").toString();
				firstInstance = false;
				lastInstance = ! rs.hasNext();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in OtherIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in OtherIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in Other doEndTag", e);
			throw new JspTagException("Exception raised in Other doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setNameShortEN(String theNameShortEN) {
		nameShortEN = theNameShortEN;
	}

	public String getNameShortEN() {
		return nameShortEN;
	}

	public static void setFirstInstance(Boolean theFirstInstance) {
		firstInstance = theFirstInstance;
	}

	public static Boolean getFirstInstance() {
		return firstInstance;
	}

	public static void setLastInstance(Boolean theLastInstance) {
		lastInstance = theLastInstance;
	}

	public static Boolean getLastInstance() {
		return lastInstance;
	}

}
