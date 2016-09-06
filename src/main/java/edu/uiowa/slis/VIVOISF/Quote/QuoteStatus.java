package edu.uiowa.slis.VIVOISF.Quote;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class QuoteStatus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static QuoteStatus currentInstance = null;
	private static final Log log = LogFactory.getLog(QuoteStatus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			QuoteStatusIterator theQuoteStatusIterator = (QuoteStatusIterator)findAncestorWithClass(this, QuoteStatusIterator.class);
			pageContext.getOut().print(theQuoteStatusIterator.getStatus());
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for status tag ");
		}
		return SKIP_BODY;
	}
}

