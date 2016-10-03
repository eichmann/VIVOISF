package edu.uiowa.slis.VIVOISF.Quote;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class QuoteIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static QuoteIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(QuoteIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			QuoteIsbn10Iterator theQuote = (QuoteIsbn10Iterator)findAncestorWithClass(this, QuoteIsbn10Iterator.class);
			pageContext.getOut().print(theQuote.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

