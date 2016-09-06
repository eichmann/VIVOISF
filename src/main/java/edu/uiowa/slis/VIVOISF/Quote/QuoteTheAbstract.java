package edu.uiowa.slis.VIVOISF.Quote;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class QuoteTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static QuoteTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(QuoteTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			QuoteTheAbstractIterator theQuote = (QuoteTheAbstractIterator)findAncestorWithClass(this, QuoteTheAbstractIterator.class);
			pageContext.getOut().print(theQuote.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

