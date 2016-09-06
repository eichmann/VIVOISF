package edu.uiowa.slis.VIVOISF.TimeZone;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TimeZoneTimeZone extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TimeZoneTimeZone currentInstance = null;
	private static final Log log = LogFactory.getLog(TimeZoneTimeZone.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TimeZoneTimeZoneIterator theTimeZone = (TimeZoneTimeZoneIterator)findAncestorWithClass(this, TimeZoneTimeZoneIterator.class);
			pageContext.getOut().print(theTimeZone.getTimeZone());
		} catch (Exception e) {
			log.error("Can't find enclosing TimeZone for timeZone tag ", e);
			throw new JspTagException("Error: Can't find enclosing TimeZone for timeZone tag ");
		}
		return SKIP_BODY;
	}
}

