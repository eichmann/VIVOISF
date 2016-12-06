package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartNameShortRUIterator theDocumentPart = (DocumentPartNameShortRUIterator)findAncestorWithClass(this, DocumentPartNameShortRUIterator.class);
			pageContext.getOut().print(theDocumentPart.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

