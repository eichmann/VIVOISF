package edu.uiowa.slis.VIVOISF.Quote;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class QuotePages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static QuotePages currentInstance = null;
	private static final Log log = LogFactory.getLog(QuotePages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			QuotePagesIterator theQuote = (QuotePagesIterator)findAncestorWithClass(this, QuotePagesIterator.class);
			pageContext.getOut().print(theQuote.getPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for pages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for pages tag ");
		}
		return SKIP_BODY;
	}
}

