package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPages currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPagesIterator theDocument = (DocumentPagesIterator)findAncestorWithClass(this, DocumentPagesIterator.class);
			pageContext.getOut().print(theDocument.getPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for pages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for pages tag ");
		}
		return SKIP_BODY;
	}
}

