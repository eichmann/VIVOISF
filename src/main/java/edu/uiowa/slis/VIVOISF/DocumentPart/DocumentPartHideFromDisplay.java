package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartHideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartHideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartHideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPart theDocumentPart = (DocumentPart)findAncestorWithClass(this, DocumentPart.class);
			if (!theDocumentPart.commitNeeded) {
				pageContext.getOut().print(theDocumentPart.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			DocumentPart theDocumentPart = (DocumentPart)findAncestorWithClass(this, DocumentPart.class);
			return theDocumentPart.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing DocumentPart for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			DocumentPart theDocumentPart = (DocumentPart)findAncestorWithClass(this, DocumentPart.class);
			theDocumentPart.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for hideFromDisplay tag ");
		}
	}
}

