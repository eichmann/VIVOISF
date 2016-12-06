package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalNameListARIterator theDateTimeInterval = (DateTimeIntervalNameListARIterator)findAncestorWithClass(this, DateTimeIntervalNameListARIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

