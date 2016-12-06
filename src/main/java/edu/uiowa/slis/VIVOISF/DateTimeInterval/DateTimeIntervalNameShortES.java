package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalNameShortESIterator theDateTimeInterval = (DateTimeIntervalNameShortESIterator)findAncestorWithClass(this, DateTimeIntervalNameShortESIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

