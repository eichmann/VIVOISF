package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartUri currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartUriIterator theDocumentPart = (DocumentPartUriIterator)findAncestorWithClass(this, DocumentPartUriIterator.class);
			pageContext.getOut().print(theDocumentPart.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for uri tag ");
		}
		return SKIP_BODY;
	}
}

