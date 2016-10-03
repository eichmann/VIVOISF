package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartPageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartPageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartPageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartPageStartIterator theDocumentPart = (DocumentPartPageStartIterator)findAncestorWithClass(this, DocumentPartPageStartIterator.class);
			pageContext.getOut().print(theDocumentPart.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

