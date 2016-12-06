package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherNameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherNameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherNameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherNameCurrencyARIterator thePublisher = (PublisherNameCurrencyARIterator)findAncestorWithClass(this, PublisherNameCurrencyARIterator.class);
			pageContext.getOut().print(thePublisher.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

