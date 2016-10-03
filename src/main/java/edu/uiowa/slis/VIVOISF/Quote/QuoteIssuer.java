package edu.uiowa.slis.VIVOISF.Quote;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class QuoteIssuer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static QuoteIssuer currentInstance = null;
	private static final Log log = LogFactory.getLog(QuoteIssuer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			QuoteIssuerIterator theQuoteIssuerIterator = (QuoteIssuerIterator)findAncestorWithClass(this, QuoteIssuerIterator.class);
			pageContext.getOut().print(theQuoteIssuerIterator.getIssuer());
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for issuer tag ");
		}
		return SKIP_BODY;
	}
}

