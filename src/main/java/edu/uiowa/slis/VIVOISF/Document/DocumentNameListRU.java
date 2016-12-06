package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentNameListRUIterator theDocument = (DocumentNameListRUIterator)findAncestorWithClass(this, DocumentNameListRUIterator.class);
			pageContext.getOut().print(theDocument.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

