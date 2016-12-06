package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalHasURLType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalHasURLType currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalHasURLType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalHasURLIterator theDateTimeIntervalHasURLIterator = (DateTimeIntervalHasURLIterator)findAncestorWithClass(this, DateTimeIntervalHasURLIterator.class);
			pageContext.getOut().print(theDateTimeIntervalHasURLIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

