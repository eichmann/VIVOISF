package edu.uiowa.slis.VIVOISF.Quote;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class QuotePageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static QuotePageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(QuotePageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			QuotePageStartIterator theQuote = (QuotePageStartIterator)findAncestorWithClass(this, QuotePageStartIterator.class);
			pageContext.getOut().print(theQuote.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

