package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalHasMinLongitudeIterator theDateTimeInterval = (DateTimeIntervalHasMinLongitudeIterator)findAncestorWithClass(this, DateTimeIntervalHasMinLongitudeIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

