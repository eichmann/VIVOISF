package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherNameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherNameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherNameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherNameCurrencyZHIterator thePublisher = (PublisherNameCurrencyZHIterator)findAncestorWithClass(this, PublisherNameCurrencyZHIterator.class);
			pageContext.getOut().print(thePublisher.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

