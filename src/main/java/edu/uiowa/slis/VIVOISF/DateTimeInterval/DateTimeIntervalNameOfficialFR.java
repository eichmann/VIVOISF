package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalNameOfficialFRIterator theDateTimeInterval = (DateTimeIntervalNameOfficialFRIterator)findAncestorWithClass(this, DateTimeIntervalNameOfficialFRIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

