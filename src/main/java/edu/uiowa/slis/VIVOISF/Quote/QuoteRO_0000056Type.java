package edu.uiowa.slis.VIVOISF.Quote;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class QuoteRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static QuoteRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(QuoteRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			QuoteRO_0000056Iterator theQuoteRO_0000056Iterator = (QuoteRO_0000056Iterator)findAncestorWithClass(this, QuoteRO_0000056Iterator.class);
			pageContext.getOut().print(theQuoteRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

