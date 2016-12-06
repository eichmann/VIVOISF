package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalNameOfficialENIterator theDateTimeInterval = (DateTimeIntervalNameOfficialENIterator)findAncestorWithClass(this, DateTimeIntervalNameOfficialENIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

