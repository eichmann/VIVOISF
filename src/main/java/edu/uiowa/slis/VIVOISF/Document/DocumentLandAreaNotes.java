package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentLandAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentLandAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentLandAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentLandAreaNotesIterator theDocument = (DocumentLandAreaNotesIterator)findAncestorWithClass(this, DocumentLandAreaNotesIterator.class);
			pageContext.getOut().print(theDocument.getLandAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for landAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for landAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

