package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectedDocumentAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectedDocumentAsinIterator theCollectedDocument = (CollectedDocumentAsinIterator)findAncestorWithClass(this, CollectedDocumentAsinIterator.class);
			pageContext.getOut().print(theCollectedDocument.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for asin tag ");
		}
		return SKIP_BODY;
	}
}

