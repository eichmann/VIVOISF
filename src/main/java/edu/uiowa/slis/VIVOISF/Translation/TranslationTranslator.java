package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationTranslator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationTranslator currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationTranslator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TranslationTranslatorIterator theTranslationTranslatorIterator = (TranslationTranslatorIterator)findAncestorWithClass(this, TranslationTranslatorIterator.class);
			pageContext.getOut().print(theTranslationTranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for translator tag ");
		}
		return SKIP_BODY;
	}
}

