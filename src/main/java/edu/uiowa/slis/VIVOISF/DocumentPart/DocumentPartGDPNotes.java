package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartGDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartGDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartGDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartGDPNotesIterator theDocumentPart = (DocumentPartGDPNotesIterator)findAncestorWithClass(this, DocumentPartGDPNotesIterator.class);
			pageContext.getOut().print(theDocumentPart.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}

