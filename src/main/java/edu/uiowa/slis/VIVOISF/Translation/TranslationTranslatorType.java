package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationTranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationTranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationTranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TranslationTranslatorIterator theTranslationTranslatorIterator = (TranslationTranslatorIterator)findAncestorWithClass(this, TranslationTranslatorIterator.class);
			pageContext.getOut().print(theTranslationTranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for translator tag ");
		}
		return SKIP_BODY;
	}
}

