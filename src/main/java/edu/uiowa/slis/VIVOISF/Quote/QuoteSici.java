package edu.uiowa.slis.VIVOISF.Quote;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class QuoteSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static QuoteSici currentInstance = null;
	private static final Log log = LogFactory.getLog(QuoteSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			QuoteSiciIterator theQuote = (QuoteSiciIterator)findAncestorWithClass(this, QuoteSiciIterator.class);
			pageContext.getOut().print(theQuote.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for sici tag ");
		}
		return SKIP_BODY;
	}
}

