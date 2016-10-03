package edu.uiowa.slis.VIVOISF.Quote;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class QuoteShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static QuoteShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(QuoteShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			QuoteShortTitleIterator theQuote = (QuoteShortTitleIterator)findAncestorWithClass(this, QuoteShortTitleIterator.class);
			pageContext.getOut().print(theQuote.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

