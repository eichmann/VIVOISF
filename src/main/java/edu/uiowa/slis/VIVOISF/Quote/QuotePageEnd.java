package edu.uiowa.slis.VIVOISF.Quote;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class QuotePageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static QuotePageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(QuotePageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			QuotePageEndIterator theQuote = (QuotePageEndIterator)findAncestorWithClass(this, QuotePageEndIterator.class);
			pageContext.getOut().print(theQuote.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

