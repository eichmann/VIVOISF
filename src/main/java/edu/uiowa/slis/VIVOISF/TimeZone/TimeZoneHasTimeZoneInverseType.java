package edu.uiowa.slis.VIVOISF.TimeZone;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TimeZoneHasTimeZoneInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TimeZoneHasTimeZoneInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(TimeZoneHasTimeZoneInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TimeZoneHasTimeZoneInverseIterator theTimeZoneHasTimeZoneInverseIterator = (TimeZoneHasTimeZoneInverseIterator)findAncestorWithClass(this, TimeZoneHasTimeZoneInverseIterator.class);
			pageContext.getOut().print(theTimeZoneHasTimeZoneInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing TimeZone for hasTimeZone tag ", e);
			throw new JspTagException("Error: Can't find enclosing TimeZone for hasTimeZone tag ");
		}
		return SKIP_BODY;
	}
}

