package edu.uiowa.slis.VIVOISF.Quote;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class QuoteCitesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static QuoteCitesType currentInstance = null;
	private static final Log log = LogFactory.getLog(QuoteCitesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			QuoteCitesIterator theQuoteCitesIterator = (QuoteCitesIterator)findAncestorWithClass(this, QuoteCitesIterator.class);
			pageContext.getOut().print(theQuoteCitesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for cites tag ");
		}
		return SKIP_BODY;
	}
}

