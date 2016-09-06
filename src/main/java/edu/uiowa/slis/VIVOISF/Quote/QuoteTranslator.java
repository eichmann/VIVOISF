package edu.uiowa.slis.VIVOISF.Quote;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class QuoteTranslator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static QuoteTranslator currentInstance = null;
	private static final Log log = LogFactory.getLog(QuoteTranslator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			QuoteTranslatorIterator theQuoteTranslatorIterator = (QuoteTranslatorIterator)findAncestorWithClass(this, QuoteTranslatorIterator.class);
			pageContext.getOut().print(theQuoteTranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for translator tag ");
		}
		return SKIP_BODY;
	}
}

