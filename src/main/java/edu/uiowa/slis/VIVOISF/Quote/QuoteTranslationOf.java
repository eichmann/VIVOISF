package edu.uiowa.slis.VIVOISF.Quote;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class QuoteTranslationOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static QuoteTranslationOf currentInstance = null;
	private static final Log log = LogFactory.getLog(QuoteTranslationOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			QuoteTranslationOfIterator theQuoteTranslationOfIterator = (QuoteTranslationOfIterator)findAncestorWithClass(this, QuoteTranslationOfIterator.class);
			pageContext.getOut().print(theQuoteTranslationOfIterator.getTranslationOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

