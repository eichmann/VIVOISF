package edu.uiowa.slis.VIVOISF.Consortium;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class ConsortiumSuffixNameIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConsortiumSuffixNameIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(ConsortiumSuffixNameIterator.class);

	String subjectURI = null;
	String suffixName = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			Consortium ancestorInstance = (Consortium) findAncestorWithClass(this, Consortium.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://purl.org/ontology/bibo/suffixName> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				suffixName = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in ConsortiumIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in ConsortiumIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				suffixName = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in ConsortiumIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in ConsortiumIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in Consortium doEndTag", e);
			throw new JspTagException("Exception raised in Consortium doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setSuffixName(String suffixName) {
		this.suffixName = suffixName;
	}

	public String getSuffixName() {
		return suffixName;
	}

}
