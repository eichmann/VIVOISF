package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalNameShortENIterator theDateTimeInterval = (DateTimeIntervalNameShortENIterator)findAncestorWithClass(this, DateTimeIntervalNameShortENIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

