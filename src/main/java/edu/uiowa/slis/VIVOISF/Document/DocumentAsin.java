package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentAsinIterator theDocument = (DocumentAsinIterator)findAncestorWithClass(this, DocumentAsinIterator.class);
			pageContext.getOut().print(theDocument.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for asin tag ");
		}
		return SKIP_BODY;
	}
}

