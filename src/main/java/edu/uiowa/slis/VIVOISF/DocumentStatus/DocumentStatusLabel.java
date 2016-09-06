package edu.uiowa.slis.VIVOISF.DocumentStatus;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentStatusLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentStatusLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentStatusLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			DocumentStatus theDocumentStatus = (DocumentStatus)findAncestorWithClass(this, DocumentStatus.class);
			if (!theDocumentStatus.commitNeeded) {
				pageContext.getOut().print(theDocumentStatus.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentStatus for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentStatus for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			DocumentStatus theDocumentStatus = (DocumentStatus)findAncestorWithClass(this, DocumentStatus.class);
			return theDocumentStatus.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing DocumentStatus for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentStatus for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			DocumentStatus theDocumentStatus = (DocumentStatus)findAncestorWithClass(this, DocumentStatus.class);
			theDocumentStatus.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentStatus for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentStatus for label tag ");
		}
	}
}

