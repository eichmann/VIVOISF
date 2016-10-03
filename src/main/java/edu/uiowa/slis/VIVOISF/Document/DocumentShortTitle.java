package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentShortTitleIterator theDocument = (DocumentShortTitleIterator)findAncestorWithClass(this, DocumentShortTitleIterator.class);
			pageContext.getOut().print(theDocument.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

