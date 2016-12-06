package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalNameOfficialITIterator theDateTimeInterval = (DateTimeIntervalNameOfficialITIterator)findAncestorWithClass(this, DateTimeIntervalNameOfficialITIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

