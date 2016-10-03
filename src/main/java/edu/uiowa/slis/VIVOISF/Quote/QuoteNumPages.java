package edu.uiowa.slis.VIVOISF.Quote;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class QuoteNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static QuoteNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(QuoteNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			QuoteNumPagesIterator theQuote = (QuoteNumPagesIterator)findAncestorWithClass(this, QuoteNumPagesIterator.class);
			pageContext.getOut().print(theQuote.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for numPages tag ");
		}
		return SKIP_BODY;
	}
}

