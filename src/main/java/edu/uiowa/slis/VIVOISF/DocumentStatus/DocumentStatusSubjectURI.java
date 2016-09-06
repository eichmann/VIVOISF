package edu.uiowa.slis.VIVOISF.DocumentStatus;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentStatusSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentStatusSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentStatusSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			DocumentStatus theDocumentStatus = (DocumentStatus)findAncestorWithClass(this, DocumentStatus.class);
			if (!theDocumentStatus.commitNeeded) {
				pageContext.getOut().print(theDocumentStatus.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentStatus for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentStatus for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			DocumentStatus theDocumentStatus = (DocumentStatus)findAncestorWithClass(this, DocumentStatus.class);
			return theDocumentStatus.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing DocumentStatus for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentStatus for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			DocumentStatus theDocumentStatus = (DocumentStatus)findAncestorWithClass(this, DocumentStatus.class);
			theDocumentStatus.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentStatus for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentStatus for subjectURI tag ");
		}
	}
}

