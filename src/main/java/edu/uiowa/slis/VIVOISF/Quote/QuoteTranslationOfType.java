package edu.uiowa.slis.VIVOISF.Quote;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class QuoteTranslationOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static QuoteTranslationOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(QuoteTranslationOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			QuoteTranslationOfIterator theQuoteTranslationOfIterator = (QuoteTranslationOfIterator)findAncestorWithClass(this, QuoteTranslationOfIterator.class);
			pageContext.getOut().print(theQuoteTranslationOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

