package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherNameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherNameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherNameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherNameCurrencyENIterator thePublisher = (PublisherNameCurrencyENIterator)findAncestorWithClass(this, PublisherNameCurrencyENIterator.class);
			pageContext.getOut().print(thePublisher.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}

