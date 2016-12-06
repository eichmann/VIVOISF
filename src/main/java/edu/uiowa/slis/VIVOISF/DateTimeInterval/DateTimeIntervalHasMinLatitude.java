package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalHasMinLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalHasMinLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalHasMinLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalHasMinLatitudeIterator theDateTimeInterval = (DateTimeIntervalHasMinLatitudeIterator)findAncestorWithClass(this, DateTimeIntervalHasMinLatitudeIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getHasMinLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for hasMinLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for hasMinLatitude tag ");
		}
		return SKIP_BODY;
	}
}

