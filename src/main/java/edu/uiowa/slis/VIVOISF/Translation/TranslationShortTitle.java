package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TranslationShortTitleIterator theTranslation = (TranslationShortTitleIterator)findAncestorWithClass(this, TranslationShortTitleIterator.class);
			pageContext.getOut().print(theTranslation.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

