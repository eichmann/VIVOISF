package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalStart currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalStart.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalStartIterator theDateTimeIntervalStartIterator = (DateTimeIntervalStartIterator)findAncestorWithClass(this, DateTimeIntervalStartIterator.class);
			pageContext.getOut().print(theDateTimeIntervalStartIterator.getStart());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for start tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for start tag ");
		}
		return SKIP_BODY;
	}
}

