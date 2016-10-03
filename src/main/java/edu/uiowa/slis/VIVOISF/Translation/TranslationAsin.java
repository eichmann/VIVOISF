package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TranslationAsinIterator theTranslation = (TranslationAsinIterator)findAncestorWithClass(this, TranslationAsinIterator.class);
			pageContext.getOut().print(theTranslation.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for asin tag ");
		}
		return SKIP_BODY;
	}
}

