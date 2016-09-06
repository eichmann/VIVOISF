package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectedDocumentHasTranslationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentHasTranslationType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentHasTranslationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectedDocumentHasTranslationIterator theCollectedDocumentHasTranslationIterator = (CollectedDocumentHasTranslationIterator)findAncestorWithClass(this, CollectedDocumentHasTranslationIterator.class);
			pageContext.getOut().print(theCollectedDocumentHasTranslationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

