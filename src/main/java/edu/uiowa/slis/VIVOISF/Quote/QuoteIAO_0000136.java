package edu.uiowa.slis.VIVOISF.Quote;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class QuoteIAO_0000136 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static QuoteIAO_0000136 currentInstance = null;
	private static final Log log = LogFactory.getLog(QuoteIAO_0000136.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			QuoteIAO_0000136Iterator theQuoteIAO_0000136Iterator = (QuoteIAO_0000136Iterator)findAncestorWithClass(this, QuoteIAO_0000136Iterator.class);
			pageContext.getOut().print(theQuoteIAO_0000136Iterator.getIAO_0000136());
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

