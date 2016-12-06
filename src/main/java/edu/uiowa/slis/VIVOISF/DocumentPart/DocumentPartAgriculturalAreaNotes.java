package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartAgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartAgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartAgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartAgriculturalAreaNotesIterator theDocumentPart = (DocumentPartAgriculturalAreaNotesIterator)findAncestorWithClass(this, DocumentPartAgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(theDocumentPart.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

