package edu.uiowa.slis.VIVOISF.Quote;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class QuoteOwner extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static QuoteOwner currentInstance = null;
	private static final Log log = LogFactory.getLog(QuoteOwner.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			QuoteOwnerIterator theQuoteOwnerIterator = (QuoteOwnerIterator)findAncestorWithClass(this, QuoteOwnerIterator.class);
			pageContext.getOut().print(theQuoteOwnerIterator.getOwner());
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for owner tag ");
		}
		return SKIP_BODY;
	}
}

