package edu.uiowa.slis.VIVOISF.Quote;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class QuoteCitedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static QuoteCitedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(QuoteCitedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			QuoteCitedByIterator theQuoteCitedByIterator = (QuoteCitedByIterator)findAncestorWithClass(this, QuoteCitedByIterator.class);
			pageContext.getOut().print(theQuoteCitedByIterator.getCitedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

