package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalNameListENIterator theDateTimeInterval = (DateTimeIntervalNameListENIterator)findAncestorWithClass(this, DateTimeIntervalNameListENIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

