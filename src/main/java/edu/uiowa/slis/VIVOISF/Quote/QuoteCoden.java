package edu.uiowa.slis.VIVOISF.Quote;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class QuoteCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static QuoteCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(QuoteCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			QuoteCodenIterator theQuote = (QuoteCodenIterator)findAncestorWithClass(this, QuoteCodenIterator.class);
			pageContext.getOut().print(theQuote.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for coden tag ");
		}
		return SKIP_BODY;
	}
}

