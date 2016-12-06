package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalNameShortFRIterator theDateTimeInterval = (DateTimeIntervalNameShortFRIterator)findAncestorWithClass(this, DateTimeIntervalNameShortFRIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

