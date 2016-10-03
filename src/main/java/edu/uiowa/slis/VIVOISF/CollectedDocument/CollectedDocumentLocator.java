package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectedDocumentLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectedDocumentLocatorIterator theCollectedDocument = (CollectedDocumentLocatorIterator)findAncestorWithClass(this, CollectedDocumentLocatorIterator.class);
			pageContext.getOut().print(theCollectedDocument.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for locator tag ");
		}
		return SKIP_BODY;
	}
}

