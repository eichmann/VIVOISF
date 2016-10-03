package edu.uiowa.slis.VIVOISF.Quote;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class QuoteEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static QuoteEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(QuoteEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			QuoteEditionIterator theQuote = (QuoteEditionIterator)findAncestorWithClass(this, QuoteEditionIterator.class);
			pageContext.getOut().print(theQuote.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for edition tag ");
		}
		return SKIP_BODY;
	}
}

