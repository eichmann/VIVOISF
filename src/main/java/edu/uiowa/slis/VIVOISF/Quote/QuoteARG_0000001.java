package edu.uiowa.slis.VIVOISF.Quote;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class QuoteARG_0000001 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static QuoteARG_0000001 currentInstance = null;
	private static final Log log = LogFactory.getLog(QuoteARG_0000001.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			QuoteARG_0000001Iterator theQuote = (QuoteARG_0000001Iterator)findAncestorWithClass(this, QuoteARG_0000001Iterator.class);
			pageContext.getOut().print(theQuote.getARG_0000001());
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for ARG_0000001 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for ARG_0000001 tag ");
		}
		return SKIP_BODY;
	}
}

