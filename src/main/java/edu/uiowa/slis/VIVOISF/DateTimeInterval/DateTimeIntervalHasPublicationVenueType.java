package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalHasPublicationVenueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalHasPublicationVenueType currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalHasPublicationVenueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalHasPublicationVenueIterator theDateTimeIntervalHasPublicationVenueIterator = (DateTimeIntervalHasPublicationVenueIterator)findAncestorWithClass(this, DateTimeIntervalHasPublicationVenueIterator.class);
			pageContext.getOut().print(theDateTimeIntervalHasPublicationVenueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

