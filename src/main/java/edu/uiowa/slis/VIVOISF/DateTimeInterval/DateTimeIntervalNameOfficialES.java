package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalNameOfficialESIterator theDateTimeInterval = (DateTimeIntervalNameOfficialESIterator)findAncestorWithClass(this, DateTimeIntervalNameOfficialESIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

