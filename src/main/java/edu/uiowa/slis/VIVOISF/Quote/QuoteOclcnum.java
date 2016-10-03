package edu.uiowa.slis.VIVOISF.Quote;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class QuoteOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static QuoteOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(QuoteOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			QuoteOclcnumIterator theQuote = (QuoteOclcnumIterator)findAncestorWithClass(this, QuoteOclcnumIterator.class);
			pageContext.getOut().print(theQuote.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

