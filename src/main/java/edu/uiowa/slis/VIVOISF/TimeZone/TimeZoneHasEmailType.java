package edu.uiowa.slis.VIVOISF.TimeZone;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TimeZoneHasEmailType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TimeZoneHasEmailType currentInstance = null;
	private static final Log log = LogFactory.getLog(TimeZoneHasEmailType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TimeZoneHasEmailIterator theTimeZoneHasEmailIterator = (TimeZoneHasEmailIterator)findAncestorWithClass(this, TimeZoneHasEmailIterator.class);
			pageContext.getOut().print(theTimeZoneHasEmailIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing TimeZone for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing TimeZone for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

