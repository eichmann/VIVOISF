package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectedDocumentIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectedDocumentIdentifierIterator theCollectedDocument = (CollectedDocumentIdentifierIterator)findAncestorWithClass(this, CollectedDocumentIdentifierIterator.class);
			pageContext.getOut().print(theCollectedDocument.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for identifier tag ");
		}
		return SKIP_BODY;
	}
}

