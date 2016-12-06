package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueHasPublicationVenue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueHasPublicationVenue currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueHasPublicationVenue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueHasPublicationVenueIterator theDateTimeValueHasPublicationVenueIterator = (DateTimeValueHasPublicationVenueIterator)findAncestorWithClass(this, DateTimeValueHasPublicationVenueIterator.class);
			pageContext.getOut().print(theDateTimeValueHasPublicationVenueIterator.getHasPublicationVenue());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

