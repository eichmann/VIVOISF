package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalPublicationVenueFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalPublicationVenueFor currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalPublicationVenueFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalPublicationVenueForIterator theDateTimeIntervalPublicationVenueForIterator = (DateTimeIntervalPublicationVenueForIterator)findAncestorWithClass(this, DateTimeIntervalPublicationVenueForIterator.class);
			pageContext.getOut().print(theDateTimeIntervalPublicationVenueForIterator.getPublicationVenueFor());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

