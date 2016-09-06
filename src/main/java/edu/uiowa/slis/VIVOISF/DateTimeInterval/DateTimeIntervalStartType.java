package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalStartType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalStartType currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalStartType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalStartIterator theDateTimeIntervalStartIterator = (DateTimeIntervalStartIterator)findAncestorWithClass(this, DateTimeIntervalStartIterator.class);
			pageContext.getOut().print(theDateTimeIntervalStartIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for start tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for start tag ");
		}
		return SKIP_BODY;
	}
}

