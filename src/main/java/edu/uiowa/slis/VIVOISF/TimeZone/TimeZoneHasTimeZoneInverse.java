package edu.uiowa.slis.VIVOISF.TimeZone;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TimeZoneHasTimeZoneInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TimeZoneHasTimeZoneInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(TimeZoneHasTimeZoneInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TimeZoneHasTimeZoneInverseIterator theTimeZoneHasTimeZoneInverseIterator = (TimeZoneHasTimeZoneInverseIterator)findAncestorWithClass(this, TimeZoneHasTimeZoneInverseIterator.class);
			pageContext.getOut().print(theTimeZoneHasTimeZoneInverseIterator.getHasTimeZoneInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing TimeZone for hasTimeZone tag ", e);
			throw new JspTagException("Error: Can't find enclosing TimeZone for hasTimeZone tag ");
		}
		return SKIP_BODY;
	}
}

