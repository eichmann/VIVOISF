package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalNameShortARIterator theDateTimeInterval = (DateTimeIntervalNameShortARIterator)findAncestorWithClass(this, DateTimeIntervalNameShortARIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

