package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalUrlIterator theDateTimeInterval = (DateTimeIntervalUrlIterator)findAncestorWithClass(this, DateTimeIntervalUrlIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for url tag ");
		}
		return SKIP_BODY;
	}
}

