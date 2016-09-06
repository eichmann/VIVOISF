package edu.uiowa.slis.VIVOISF.Quote;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class QuoteReproducesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static QuoteReproducesType currentInstance = null;
	private static final Log log = LogFactory.getLog(QuoteReproducesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			QuoteReproducesIterator theQuoteReproducesIterator = (QuoteReproducesIterator)findAncestorWithClass(this, QuoteReproducesIterator.class);
			pageContext.getOut().print(theQuoteReproducesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

