package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Document theDocument = (Document)findAncestorWithClass(this, Document.class);
			if (!theDocument.commitNeeded) {
				pageContext.getOut().print(theDocument.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Document for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			Document theDocument = (Document)findAncestorWithClass(this, Document.class);
			return theDocument.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing Document for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			Document theDocument = (Document)findAncestorWithClass(this, Document.class);
			theDocument.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing Document for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for placeOfPublication tag ");
		}
	}
}

