package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectedDocumentCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectedDocumentCodenIterator theCollectedDocument = (CollectedDocumentCodenIterator)findAncestorWithClass(this, CollectedDocumentCodenIterator.class);
			pageContext.getOut().print(theCollectedDocument.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for coden tag ");
		}
		return SKIP_BODY;
	}
}

