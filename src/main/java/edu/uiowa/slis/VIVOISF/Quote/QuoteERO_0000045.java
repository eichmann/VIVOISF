package edu.uiowa.slis.VIVOISF.Quote;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class QuoteERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static QuoteERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(QuoteERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			QuoteERO_0000045Iterator theQuote = (QuoteERO_0000045Iterator)findAncestorWithClass(this, QuoteERO_0000045Iterator.class);
			pageContext.getOut().print(theQuote.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

