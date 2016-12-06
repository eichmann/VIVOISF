package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValuePublicationVenueForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValuePublicationVenueForType currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValuePublicationVenueForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeValuePublicationVenueForIterator theDateTimeValuePublicationVenueForIterator = (DateTimeValuePublicationVenueForIterator)findAncestorWithClass(this, DateTimeValuePublicationVenueForIterator.class);
			pageContext.getOut().print(theDateTimeValuePublicationVenueForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

