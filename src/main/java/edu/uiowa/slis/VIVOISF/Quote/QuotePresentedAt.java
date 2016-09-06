package edu.uiowa.slis.VIVOISF.Quote;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class QuotePresentedAt extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static QuotePresentedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(QuotePresentedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			QuotePresentedAtIterator theQuotePresentedAtIterator = (QuotePresentedAtIterator)findAncestorWithClass(this, QuotePresentedAtIterator.class);
			pageContext.getOut().print(theQuotePresentedAtIterator.getPresentedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

