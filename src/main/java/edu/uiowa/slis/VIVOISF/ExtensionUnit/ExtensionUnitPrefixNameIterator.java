package edu.uiowa.slis.VIVOISF.ExtensionUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class ExtensionUnitPrefixNameIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExtensionUnitPrefixNameIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(ExtensionUnitPrefixNameIterator.class);

	String subjectURI = null;
	String prefixName = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			ExtensionUnit ancestorInstance = (ExtensionUnit) findAncestorWithClass(this, ExtensionUnit.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://purl.org/ontology/bibo/prefixName> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				prefixName = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in ExtensionUnitIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in ExtensionUnitIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				prefixName = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in ExtensionUnitIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in ExtensionUnitIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in ExtensionUnit doEndTag", e);
			throw new JspTagException("Exception raised in ExtensionUnit doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setPrefixName(String prefixName) {
		this.prefixName = prefixName;
	}

	public String getPrefixName() {
		return prefixName;
	}

}
