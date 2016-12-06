package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentGDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentGDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentGDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentGDPNotesIterator theDocument = (DocumentGDPNotesIterator)findAncestorWithClass(this, DocumentGDPNotesIterator.class);
			pageContext.getOut().print(theDocument.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}

