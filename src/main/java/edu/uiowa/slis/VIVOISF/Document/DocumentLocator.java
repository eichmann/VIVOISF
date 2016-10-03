package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentLocatorIterator theDocument = (DocumentLocatorIterator)findAncestorWithClass(this, DocumentLocatorIterator.class);
			pageContext.getOut().print(theDocument.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for locator tag ");
		}
		return SKIP_BODY;
	}
}

