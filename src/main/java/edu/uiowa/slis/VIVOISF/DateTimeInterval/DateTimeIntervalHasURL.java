package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalHasURL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalHasURL currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalHasURL.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalHasURLIterator theDateTimeIntervalHasURLIterator = (DateTimeIntervalHasURLIterator)findAncestorWithClass(this, DateTimeIntervalHasURLIterator.class);
			pageContext.getOut().print(theDateTimeIntervalHasURLIterator.getHasURL());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

