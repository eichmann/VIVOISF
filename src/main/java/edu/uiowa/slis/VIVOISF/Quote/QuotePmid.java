package edu.uiowa.slis.VIVOISF.Quote;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class QuotePmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static QuotePmid currentInstance = null;
	private static final Log log = LogFactory.getLog(QuotePmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			QuotePmidIterator theQuote = (QuotePmidIterator)findAncestorWithClass(this, QuotePmidIterator.class);
			pageContext.getOut().print(theQuote.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for pmid tag ");
		}
		return SKIP_BODY;
	}
}

