package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherNameCurrencyRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherNameCurrencyRU currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherNameCurrencyRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherNameCurrencyRUIterator thePublisher = (PublisherNameCurrencyRUIterator)findAncestorWithClass(this, PublisherNameCurrencyRUIterator.class);
			pageContext.getOut().print(thePublisher.getNameCurrencyRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for nameCurrencyRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for nameCurrencyRU tag ");
		}
		return SKIP_BODY;
	}
}

