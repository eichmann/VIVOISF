package edu.uiowa.slis.VIVOISF.AudioDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class AudioDocumentCodenIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioDocumentCodenIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDocumentCodenIterator.class);

	String subjectURI = null;
	String coden = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			AudioDocument ancestorInstance = (AudioDocument) findAncestorWithClass(this, AudioDocument.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://purl.org/ontology/bibo/coden> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				coden = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in AudioDocumentIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in AudioDocumentIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				coden = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in AudioDocumentIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in AudioDocumentIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in AudioDocument doEndTag", e);
			throw new JspTagException("Exception raised in AudioDocument doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setCoden(String coden) {
		this.coden = coden;
	}

	public String getCoden() {
		return coden;
	}

}
