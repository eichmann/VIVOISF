package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentHDINotesIterator theDocument = (DocumentHDINotesIterator)findAncestorWithClass(this, DocumentHDINotesIterator.class);
			pageContext.getOut().print(theDocument.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

