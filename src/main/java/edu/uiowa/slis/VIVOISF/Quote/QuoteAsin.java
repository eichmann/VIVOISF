package edu.uiowa.slis.VIVOISF.Quote;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class QuoteAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static QuoteAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(QuoteAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			QuoteAsinIterator theQuote = (QuoteAsinIterator)findAncestorWithClass(this, QuoteAsinIterator.class);
			pageContext.getOut().print(theQuote.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for asin tag ");
		}
		return SKIP_BODY;
	}
}

