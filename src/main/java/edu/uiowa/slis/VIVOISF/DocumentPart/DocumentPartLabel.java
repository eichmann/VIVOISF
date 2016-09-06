package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPart theDocumentPart = (DocumentPart)findAncestorWithClass(this, DocumentPart.class);
			if (!theDocumentPart.commitNeeded) {
				pageContext.getOut().print(theDocumentPart.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			DocumentPart theDocumentPart = (DocumentPart)findAncestorWithClass(this, DocumentPart.class);
			return theDocumentPart.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing DocumentPart for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			DocumentPart theDocumentPart = (DocumentPart)findAncestorWithClass(this, DocumentPart.class);
			theDocumentPart.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for label tag ");
		}
	}
}

