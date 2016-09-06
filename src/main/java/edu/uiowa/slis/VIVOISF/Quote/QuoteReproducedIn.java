package edu.uiowa.slis.VIVOISF.Quote;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class QuoteReproducedIn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static QuoteReproducedIn currentInstance = null;
	private static final Log log = LogFactory.getLog(QuoteReproducedIn.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			QuoteReproducedInIterator theQuoteReproducedInIterator = (QuoteReproducedInIterator)findAncestorWithClass(this, QuoteReproducedInIterator.class);
			pageContext.getOut().print(theQuoteReproducedInIterator.getReproducedIn());
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

