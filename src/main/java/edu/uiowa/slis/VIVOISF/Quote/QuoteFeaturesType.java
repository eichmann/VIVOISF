package edu.uiowa.slis.VIVOISF.Quote;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class QuoteFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static QuoteFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(QuoteFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			QuoteFeaturesIterator theQuoteFeaturesIterator = (QuoteFeaturesIterator)findAncestorWithClass(this, QuoteFeaturesIterator.class);
			pageContext.getOut().print(theQuoteFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for features tag ");
		}
		return SKIP_BODY;
	}
}

