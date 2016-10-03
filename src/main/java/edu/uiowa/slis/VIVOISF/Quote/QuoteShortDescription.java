package edu.uiowa.slis.VIVOISF.Quote;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class QuoteShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static QuoteShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(QuoteShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			QuoteShortDescriptionIterator theQuote = (QuoteShortDescriptionIterator)findAncestorWithClass(this, QuoteShortDescriptionIterator.class);
			pageContext.getOut().print(theQuote.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

