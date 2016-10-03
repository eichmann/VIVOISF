package edu.uiowa.slis.VIVOISF.WorkingPaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class WorkingPaperGtin14Iterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkingPaperGtin14Iterator currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkingPaperGtin14Iterator.class);

	String subjectURI = null;
	String gtin14 = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			WorkingPaper ancestorInstance = (WorkingPaper) findAncestorWithClass(this, WorkingPaper.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://purl.org/ontology/bibo/gtin14> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				gtin14 = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in WorkingPaperIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in WorkingPaperIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				gtin14 = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in WorkingPaperIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in WorkingPaperIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in WorkingPaper doEndTag", e);
			throw new JspTagException("Exception raised in WorkingPaper doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setGtin14(String gtin14) {
		this.gtin14 = gtin14;
	}

	public String getGtin14() {
		return gtin14;
	}

}
