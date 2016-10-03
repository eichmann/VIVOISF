package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectedDocumentShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectedDocumentShortTitleIterator theCollectedDocument = (CollectedDocumentShortTitleIterator)findAncestorWithClass(this, CollectedDocumentShortTitleIterator.class);
			pageContext.getOut().print(theCollectedDocument.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

