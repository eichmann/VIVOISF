package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartHDINotesIterator theDocumentPart = (DocumentPartHDINotesIterator)findAncestorWithClass(this, DocumentPartHDINotesIterator.class);
			pageContext.getOut().print(theDocumentPart.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

