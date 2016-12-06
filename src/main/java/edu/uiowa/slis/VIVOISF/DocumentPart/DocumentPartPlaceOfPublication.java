package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartPlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartPlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartPlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPart theDocumentPart = (DocumentPart)findAncestorWithClass(this, DocumentPart.class);
			if (!theDocumentPart.commitNeeded) {
				pageContext.getOut().print(theDocumentPart.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			DocumentPart theDocumentPart = (DocumentPart)findAncestorWithClass(this, DocumentPart.class);
			return theDocumentPart.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing DocumentPart for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			DocumentPart theDocumentPart = (DocumentPart)findAncestorWithClass(this, DocumentPart.class);
			theDocumentPart.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for placeOfPublication tag ");
		}
	}
}

