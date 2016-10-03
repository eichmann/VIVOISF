package edu.uiowa.slis.VIVOISF.Quote;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class QuoteUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static QuoteUri currentInstance = null;
	private static final Log log = LogFactory.getLog(QuoteUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			QuoteUriIterator theQuote = (QuoteUriIterator)findAncestorWithClass(this, QuoteUriIterator.class);
			pageContext.getOut().print(theQuote.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for uri tag ");
		}
		return SKIP_BODY;
	}
}

