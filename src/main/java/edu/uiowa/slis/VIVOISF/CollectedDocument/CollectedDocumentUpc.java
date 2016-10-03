package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectedDocumentUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectedDocumentUpcIterator theCollectedDocument = (CollectedDocumentUpcIterator)findAncestorWithClass(this, CollectedDocumentUpcIterator.class);
			pageContext.getOut().print(theCollectedDocument.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for upc tag ");
		}
		return SKIP_BODY;
	}
}

