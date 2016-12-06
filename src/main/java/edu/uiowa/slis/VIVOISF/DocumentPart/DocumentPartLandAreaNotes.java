package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartLandAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartLandAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartLandAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartLandAreaNotesIterator theDocumentPart = (DocumentPartLandAreaNotesIterator)findAncestorWithClass(this, DocumentPartLandAreaNotesIterator.class);
			pageContext.getOut().print(theDocumentPart.getLandAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for landAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for landAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

