package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationTranslationOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationTranslationOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationTranslationOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TranslationTranslationOfIterator theTranslationTranslationOfIterator = (TranslationTranslationOfIterator)findAncestorWithClass(this, TranslationTranslationOfIterator.class);
			pageContext.getOut().print(theTranslationTranslationOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

