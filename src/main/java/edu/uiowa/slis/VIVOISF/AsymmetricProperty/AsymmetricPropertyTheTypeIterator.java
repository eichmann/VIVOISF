package edu.uiowa.slis.VIVOISF.AsymmetricProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class AsymmetricPropertyTheTypeIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AsymmetricPropertyTheTypeIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(AsymmetricPropertyTheTypeIterator.class);

	static boolean firstInstance = false;
	static boolean lastInstance = false;

	String subjectURI = null;
	String theType = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			AsymmetricProperty ancestorInstance = (AsymmetricProperty) findAncestorWithClass(this, AsymmetricProperty.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				theType = sol.get("?s").isLiteral() ? sol.get("?s").asLiteral().getString() : sol.get("?s").toString();
				firstInstance = true;
				lastInstance = ! rs.hasNext();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in AsymmetricPropertyIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in AsymmetricPropertyIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				theType = sol.get("?s").isLiteral() ? sol.get("?s").asLiteral().getString() : sol.get("?s").toString();
				firstInstance = false;
				lastInstance = ! rs.hasNext();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in AsymmetricPropertyIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in AsymmetricPropertyIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in AsymmetricProperty doEndTag", e);
			throw new JspTagException("Exception raised in AsymmetricProperty doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setTheType(String theTheType) {
		theType = theTheType;
	}

	public String getTheType() {
		return theType;
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
