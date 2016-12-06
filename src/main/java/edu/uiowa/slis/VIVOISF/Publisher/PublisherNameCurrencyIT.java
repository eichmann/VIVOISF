package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherNameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherNameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherNameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherNameCurrencyITIterator thePublisher = (PublisherNameCurrencyITIterator)findAncestorWithClass(this, PublisherNameCurrencyITIterator.class);
			pageContext.getOut().print(thePublisher.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

