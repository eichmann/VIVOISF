package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectedDocumentAuthorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentAuthorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentAuthorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectedDocumentAuthorListIterator theCollectedDocumentAuthorListIterator = (CollectedDocumentAuthorListIterator)findAncestorWithClass(this, CollectedDocumentAuthorListIterator.class);
			pageContext.getOut().print(theCollectedDocumentAuthorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for authorList tag ");
		}
		return SKIP_BODY;
	}
}

