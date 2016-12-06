package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentNameShortRUIterator theDocument = (DocumentNameShortRUIterator)findAncestorWithClass(this, DocumentNameShortRUIterator.class);
			pageContext.getOut().print(theDocument.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

