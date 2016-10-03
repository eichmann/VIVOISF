package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectedDocumentUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentUri currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectedDocumentUriIterator theCollectedDocument = (CollectedDocumentUriIterator)findAncestorWithClass(this, CollectedDocumentUriIterator.class);
			pageContext.getOut().print(theCollectedDocument.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for uri tag ");
		}
		return SKIP_BODY;
	}
}

