package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherCodeCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherCodeCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherCodeCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherCodeCurrencyIterator thePublisher = (PublisherCodeCurrencyIterator)findAncestorWithClass(this, PublisherCodeCurrencyIterator.class);
			pageContext.getOut().print(thePublisher.getCodeCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for codeCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for codeCurrency tag ");
		}
		return SKIP_BODY;
	}
}

