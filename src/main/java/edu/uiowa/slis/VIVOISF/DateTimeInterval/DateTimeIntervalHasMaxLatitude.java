package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalHasMaxLatitudeIterator theDateTimeInterval = (DateTimeIntervalHasMaxLatitudeIterator)findAncestorWithClass(this, DateTimeIntervalHasMaxLatitudeIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

