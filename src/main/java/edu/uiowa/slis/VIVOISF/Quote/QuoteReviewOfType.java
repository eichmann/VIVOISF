package edu.uiowa.slis.VIVOISF.Quote;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class QuoteReviewOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static QuoteReviewOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(QuoteReviewOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			QuoteReviewOfIterator theQuoteReviewOfIterator = (QuoteReviewOfIterator)findAncestorWithClass(this, QuoteReviewOfIterator.class);
			pageContext.getOut().print(theQuoteReviewOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

