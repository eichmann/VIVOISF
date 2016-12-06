package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValuePublicationVenueFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValuePublicationVenueFor currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValuePublicationVenueFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeValuePublicationVenueForIterator theDateTimeValuePublicationVenueForIterator = (DateTimeValuePublicationVenueForIterator)findAncestorWithClass(this, DateTimeValuePublicationVenueForIterator.class);
			pageContext.getOut().print(theDateTimeValuePublicationVenueForIterator.getPublicationVenueFor());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}
