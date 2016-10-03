package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectedDocumentShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectedDocumentShortDescriptionIterator theCollectedDocument = (CollectedDocumentShortDescriptionIterator)findAncestorWithClass(this, CollectedDocumentShortDescriptionIterator.class);
			pageContext.getOut().print(theCollectedDocument.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

