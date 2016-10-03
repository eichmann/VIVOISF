package edu.uiowa.slis.VIVOISF.Quote;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class QuoteLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static QuoteLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(QuoteLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			QuoteLccnIterator theQuote = (QuoteLccnIterator)findAncestorWithClass(this, QuoteLccnIterator.class);
			pageContext.getOut().print(theQuote.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for lccn tag ");
		}
		return SKIP_BODY;
	}
}

