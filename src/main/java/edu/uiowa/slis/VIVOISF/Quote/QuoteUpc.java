package edu.uiowa.slis.VIVOISF.Quote;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class QuoteUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static QuoteUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(QuoteUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			QuoteUpcIterator theQuote = (QuoteUpcIterator)findAncestorWithClass(this, QuoteUpcIterator.class);
			pageContext.getOut().print(theQuote.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for upc tag ");
		}
		return SKIP_BODY;
	}
}

