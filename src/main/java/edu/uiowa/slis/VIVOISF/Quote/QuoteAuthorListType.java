package edu.uiowa.slis.VIVOISF.Quote;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class QuoteAuthorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static QuoteAuthorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(QuoteAuthorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			QuoteAuthorListIterator theQuoteAuthorListIterator = (QuoteAuthorListIterator)findAncestorWithClass(this, QuoteAuthorListIterator.class);
			pageContext.getOut().print(theQuoteAuthorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for authorList tag ");
		}
		return SKIP_BODY;
	}
}

