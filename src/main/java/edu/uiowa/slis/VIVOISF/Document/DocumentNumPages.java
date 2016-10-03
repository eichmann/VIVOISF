package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentNumPagesIterator theDocument = (DocumentNumPagesIterator)findAncestorWithClass(this, DocumentNumPagesIterator.class);
			pageContext.getOut().print(theDocument.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for numPages tag ");
		}
		return SKIP_BODY;
	}
}

