package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalHasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalHasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalHasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalHasMaxLongitudeIterator theDateTimeInterval = (DateTimeIntervalHasMaxLongitudeIterator)findAncestorWithClass(this, DateTimeIntervalHasMaxLongitudeIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}

