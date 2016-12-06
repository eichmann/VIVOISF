package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalDescriptionIterator theDateTimeInterval = (DateTimeIntervalDescriptionIterator)findAncestorWithClass(this, DateTimeIntervalDescriptionIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for description tag ");
		}
		return SKIP_BODY;
	}
}

