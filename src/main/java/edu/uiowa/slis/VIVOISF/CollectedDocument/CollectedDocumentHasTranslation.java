package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectedDocumentHasTranslation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentHasTranslation currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentHasTranslation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectedDocumentHasTranslationIterator theCollectedDocumentHasTranslationIterator = (CollectedDocumentHasTranslationIterator)findAncestorWithClass(this, CollectedDocumentHasTranslationIterator.class);
			pageContext.getOut().print(theCollectedDocumentHasTranslationIterator.getHasTranslation());
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

