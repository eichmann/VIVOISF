package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalHasEmailType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalHasEmailType currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalHasEmailType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalHasEmailIterator theDateTimeIntervalHasEmailIterator = (DateTimeIntervalHasEmailIterator)findAncestorWithClass(this, DateTimeIntervalHasEmailIterator.class);
			pageContext.getOut().print(theDateTimeIntervalHasEmailIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

