package edu.uiowa.slis.VIVOISF.Quote;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class QuoteLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static QuoteLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(QuoteLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			QuoteLocatorIterator theQuote = (QuoteLocatorIterator)findAncestorWithClass(this, QuoteLocatorIterator.class);
			pageContext.getOut().print(theQuote.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for locator tag ");
		}
		return SKIP_BODY;
	}
}

