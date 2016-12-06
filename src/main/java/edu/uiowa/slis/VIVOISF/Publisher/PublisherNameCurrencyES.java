package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherNameCurrencyESIterator thePublisher = (PublisherNameCurrencyESIterator)findAncestorWithClass(this, PublisherNameCurrencyESIterator.class);
			pageContext.getOut().print(thePublisher.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

