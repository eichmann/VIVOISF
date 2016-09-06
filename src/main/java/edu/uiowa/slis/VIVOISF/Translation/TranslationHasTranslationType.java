package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationHasTranslationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationHasTranslationType currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationHasTranslationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TranslationHasTranslationIterator theTranslationHasTranslationIterator = (TranslationHasTranslationIterator)findAncestorWithClass(this, TranslationHasTranslationIterator.class);
			pageContext.getOut().print(theTranslationHasTranslationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

