package edu.uiowa.slis.VIVOISF.TimeZone;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TimeZoneHasAddressType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TimeZoneHasAddressType currentInstance = null;
	private static final Log log = LogFactory.getLog(TimeZoneHasAddressType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TimeZoneHasAddressIterator theTimeZoneHasAddressIterator = (TimeZoneHasAddressIterator)findAncestorWithClass(this, TimeZoneHasAddressIterator.class);
			pageContext.getOut().print(theTimeZoneHasAddressIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing TimeZone for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing TimeZone for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

