package edu.uiowa.slis.VIVOISF.Quote;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class QuoteSection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static QuoteSection currentInstance = null;
	private static final Log log = LogFactory.getLog(QuoteSection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			QuoteSectionIterator theQuote = (QuoteSectionIterator)findAncestorWithClass(this, QuoteSectionIterator.class);
			pageContext.getOut().print(theQuote.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for section tag ");
		}
		return SKIP_BODY;
	}
}

