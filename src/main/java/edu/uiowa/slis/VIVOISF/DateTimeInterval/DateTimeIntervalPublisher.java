package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalPublisher extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalPublisher currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalPublisher.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalPublisherIterator theDateTimeIntervalPublisherIterator = (DateTimeIntervalPublisherIterator)findAncestorWithClass(this, DateTimeIntervalPublisherIterator.class);
			pageContext.getOut().print(theDateTimeIntervalPublisherIterator.getPublisher());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for publisher tag ");
		}
		return SKIP_BODY;
	}
}

