package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherDateTimeValue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherDateTimeValue currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherDateTimeValue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherDateTimeValueIterator thePublisherDateTimeValueIterator = (PublisherDateTimeValueIterator)findAncestorWithClass(this, PublisherDateTimeValueIterator.class);
			pageContext.getOut().print(thePublisherDateTimeValueIterator.getDateTimeValue());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

