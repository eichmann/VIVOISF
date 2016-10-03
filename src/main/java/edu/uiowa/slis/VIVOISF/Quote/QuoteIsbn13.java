package edu.uiowa.slis.VIVOISF.Quote;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class QuoteIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static QuoteIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(QuoteIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			QuoteIsbn13Iterator theQuote = (QuoteIsbn13Iterator)findAncestorWithClass(this, QuoteIsbn13Iterator.class);
			pageContext.getOut().print(theQuote.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

