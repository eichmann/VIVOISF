package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentAgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentAgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentAgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentAgriculturalAreaNotesIterator theDocument = (DocumentAgriculturalAreaNotesIterator)findAncestorWithClass(this, DocumentAgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(theDocument.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

