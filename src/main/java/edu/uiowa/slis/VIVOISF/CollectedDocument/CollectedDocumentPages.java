package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectedDocumentPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentPages currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectedDocumentPagesIterator theCollectedDocument = (CollectedDocumentPagesIterator)findAncestorWithClass(this, CollectedDocumentPagesIterator.class);
			pageContext.getOut().print(theCollectedDocument.getPages());
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for pages tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for pages tag ");
		}
		return SKIP_BODY;
	}
}

