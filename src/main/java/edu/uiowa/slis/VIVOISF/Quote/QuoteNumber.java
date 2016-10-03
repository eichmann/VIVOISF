package edu.uiowa.slis.VIVOISF.Quote;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class QuoteNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static QuoteNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(QuoteNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			QuoteNumberIterator theQuote = (QuoteNumberIterator)findAncestorWithClass(this, QuoteNumberIterator.class);
			pageContext.getOut().print(theQuote.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for number tag ");
		}
		return SKIP_BODY;
	}
}

