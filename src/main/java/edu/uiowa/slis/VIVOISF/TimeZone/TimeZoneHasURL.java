package edu.uiowa.slis.VIVOISF.TimeZone;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TimeZoneHasURL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TimeZoneHasURL currentInstance = null;
	private static final Log log = LogFactory.getLog(TimeZoneHasURL.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TimeZoneHasURLIterator theTimeZoneHasURLIterator = (TimeZoneHasURLIterator)findAncestorWithClass(this, TimeZoneHasURLIterator.class);
			pageContext.getOut().print(theTimeZoneHasURLIterator.getHasURL());
		} catch (Exception e) {
			log.error("Can't find enclosing TimeZone for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing TimeZone for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

