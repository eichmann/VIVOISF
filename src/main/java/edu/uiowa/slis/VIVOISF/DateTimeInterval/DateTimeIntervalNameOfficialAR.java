package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalNameOfficialARIterator theDateTimeInterval = (DateTimeIntervalNameOfficialARIterator)findAncestorWithClass(this, DateTimeIntervalNameOfficialARIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

