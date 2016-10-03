package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartUpcIterator theDocumentPart = (DocumentPartUpcIterator)findAncestorWithClass(this, DocumentPartUpcIterator.class);
			pageContext.getOut().print(theDocumentPart.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for upc tag ");
		}
		return SKIP_BODY;
	}
}

