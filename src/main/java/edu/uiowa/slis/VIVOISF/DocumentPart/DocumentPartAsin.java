package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartAsinIterator theDocumentPart = (DocumentPartAsinIterator)findAncestorWithClass(this, DocumentPartAsinIterator.class);
			pageContext.getOut().print(theDocumentPart.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for asin tag ");
		}
		return SKIP_BODY;
	}
}

