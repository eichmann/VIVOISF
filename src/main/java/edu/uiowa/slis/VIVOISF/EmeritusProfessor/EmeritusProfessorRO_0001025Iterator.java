package edu.uiowa.slis.VIVOISF.EmeritusProfessor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class EmeritusProfessorRO_0001025Iterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusProfessorRO_0001025Iterator currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusProfessorRO_0001025Iterator.class);

	String subjectURI = null;
	String RO_0001025 = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			EmeritusProfessor ancestorInstance = (EmeritusProfessor) findAncestorWithClass(this, EmeritusProfessor.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://purl.obolibrary.org/obo/RO_0001025> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				RO_0001025 = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in EmeritusProfessorIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in EmeritusProfessorIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				RO_0001025 = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in EmeritusProfessorIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in EmeritusProfessorIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in EmeritusProfessor doEndTag", e);
			throw new JspTagException("Exception raised in EmeritusProfessor doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setRO_0001025(String RO_0001025) {
		this.RO_0001025 = RO_0001025;
	}

	public String getRO_0001025() {
		return RO_0001025;
	}

}
