package edu.uiowa.slis.VIVOISF.Quote;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class QuoteDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static QuoteDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(QuoteDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			QuoteDoiIterator theQuote = (QuoteDoiIterator)findAncestorWithClass(this, QuoteDoiIterator.class);
			pageContext.getOut().print(theQuote.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for doi tag ");
		}
		return SKIP_BODY;
	}
}

