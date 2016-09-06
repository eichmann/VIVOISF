package edu.uiowa.slis.VIVOISF.ERO_0000595;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class ERO_0000595ERO_0000774Iterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000595ERO_0000774Iterator currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000595ERO_0000774Iterator.class);

	String subjectURI = null;
	String ERO_0000774 = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			ERO_0000595 ancestorInstance = (ERO_0000595) findAncestorWithClass(this, ERO_0000595.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(Prefix_1_4+"SELECT ?s where { <" + subjectURI + "> <http://purl.obolibrary.org/obo/ERO_0000774> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				ERO_0000774 = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in ERO_0000595Iterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in ERO_0000595Iterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				ERO_0000774 = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in ERO_0000595Iterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in ERO_0000595Iterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in ERO_0000595 doEndTag", e);
			throw new JspTagException("Exception raised in ERO_0000595 doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setERO_0000774(String ERO_0000774) {
		this.ERO_0000774 = ERO_0000774;
	}

	public String getERO_0000774() {
		return ERO_0000774;
	}

}
