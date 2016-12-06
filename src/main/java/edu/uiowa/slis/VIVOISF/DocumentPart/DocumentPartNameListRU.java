package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartNameListRUIterator theDocumentPart = (DocumentPartNameListRUIterator)findAncestorWithClass(this, DocumentPartNameListRUIterator.class);
			pageContext.getOut().print(theDocumentPart.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

