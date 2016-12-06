package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalNameListFRIterator theDateTimeInterval = (DateTimeIntervalNameListFRIterator)findAncestorWithClass(this, DateTimeIntervalNameListFRIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

