package edu.uiowa.slis.VIVOISF.Quote;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class QuoteIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static QuoteIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(QuoteIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			QuoteIdentifierIterator theQuote = (QuoteIdentifierIterator)findAncestorWithClass(this, QuoteIdentifierIterator.class);
			pageContext.getOut().print(theQuote.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for identifier tag ");
		}
		return SKIP_BODY;
	}
}

