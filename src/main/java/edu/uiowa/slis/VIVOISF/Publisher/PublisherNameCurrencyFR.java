package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherNameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherNameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherNameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherNameCurrencyFRIterator thePublisher = (PublisherNameCurrencyFRIterator)findAncestorWithClass(this, PublisherNameCurrencyFRIterator.class);
			pageContext.getOut().print(thePublisher.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

