package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TranslationLocatorIterator theTranslation = (TranslationLocatorIterator)findAncestorWithClass(this, TranslationLocatorIterator.class);
			pageContext.getOut().print(theTranslation.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for locator tag ");
		}
		return SKIP_BODY;
	}
}

