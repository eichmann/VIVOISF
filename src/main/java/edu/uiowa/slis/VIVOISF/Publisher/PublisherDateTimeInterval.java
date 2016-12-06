package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherDateTimeInterval extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherDateTimeInterval currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherDateTimeInterval.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherDateTimeIntervalIterator thePublisherDateTimeIntervalIterator = (PublisherDateTimeIntervalIterator)findAncestorWithClass(this, PublisherDateTimeIntervalIterator.class);
			pageContext.getOut().print(thePublisherDateTimeIntervalIterator.getDateTimeInterval());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

