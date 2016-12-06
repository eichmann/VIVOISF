package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalNameShortITIterator theDateTimeInterval = (DateTimeIntervalNameShortITIterator)findAncestorWithClass(this, DateTimeIntervalNameShortITIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

