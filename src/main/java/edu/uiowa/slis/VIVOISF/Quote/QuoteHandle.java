package edu.uiowa.slis.VIVOISF.Quote;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class QuoteHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static QuoteHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(QuoteHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			QuoteHandleIterator theQuote = (QuoteHandleIterator)findAncestorWithClass(this, QuoteHandleIterator.class);
			pageContext.getOut().print(theQuote.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for handle tag ");
		}
		return SKIP_BODY;
	}
}

