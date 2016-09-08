package edu.uiowa.slis.VIVOISF.DocumentStatus;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class DocumentStatus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentStatus currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentStatus.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			DocumentStatusIterator theDocumentStatusIterator = (DocumentStatusIterator) findAncestorWithClass(this, DocumentStatusIterator.class);

			if (theDocumentStatusIterator != null) {
				subjectURI = theDocumentStatusIterator.getSubjectURI();
				label = theDocumentStatusIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Document.DocumentStatusIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Document.DocumentStatusIterator)this.getParent()).getStatus();
			}

			edu.uiowa.slis.VIVOISF.Document.DocumentStatusIterator theDocumentStatusIterator = (edu.uiowa.slis.VIVOISF.Document.DocumentStatusIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Document.DocumentStatusIterator.class);

			if (subjectURI == null && theDocumentStatusIterator != null) {
				subjectURI = theDocumentStatusIterator.getStatus();
			}

			if (theDocumentStatusIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(Prefix_1_4
				+ " SELECT ?label  where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in DocumentStatus doStartTag", e);
			throw new JspTagException("Exception raised in DocumentStatus doStartTag");
		} finally {
			freeConnection();
		}

		return EVAL_PAGE;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in DocumentStatus doEndTag", e);
			throw new JspTagException("Exception raised in DocumentStatus doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setSubjectURI(String subjectURI) {
		this.subjectURI = subjectURI;
	}

	public String getSubjectURI() {
		return subjectURI;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

}
