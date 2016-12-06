package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalGeographicFocus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalGeographicFocus currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalGeographicFocus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalGeographicFocusIterator theDateTimeIntervalGeographicFocusIterator = (DateTimeIntervalGeographicFocusIterator)findAncestorWithClass(this, DateTimeIntervalGeographicFocusIterator.class);
			pageContext.getOut().print(theDateTimeIntervalGeographicFocusIterator.getGeographicFocus());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

