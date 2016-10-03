package edu.uiowa.slis.VIVOISF.Quote;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class QuoteEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static QuoteEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(QuoteEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			QuoteEanucc13Iterator theQuote = (QuoteEanucc13Iterator)findAncestorWithClass(this, QuoteEanucc13Iterator.class);
			pageContext.getOut().print(theQuote.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

