package edu.uiowa.slis.VIVOISF.Quote;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class QuoteInformationResourceSupportedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static QuoteInformationResourceSupportedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(QuoteInformationResourceSupportedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			QuoteInformationResourceSupportedByIterator theQuoteInformationResourceSupportedByIterator = (QuoteInformationResourceSupportedByIterator)findAncestorWithClass(this, QuoteInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theQuoteInformationResourceSupportedByIterator.getInformationResourceSupportedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

