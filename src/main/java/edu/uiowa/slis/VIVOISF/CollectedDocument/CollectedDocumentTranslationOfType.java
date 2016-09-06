package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectedDocumentTranslationOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentTranslationOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentTranslationOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectedDocumentTranslationOfIterator theCollectedDocumentTranslationOfIterator = (CollectedDocumentTranslationOfIterator)findAncestorWithClass(this, CollectedDocumentTranslationOfIterator.class);
			pageContext.getOut().print(theCollectedDocumentTranslationOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

