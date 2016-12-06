package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalNationalityEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalNationalityEN currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalNationalityEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalNationalityENIterator theDateTimeInterval = (DateTimeIntervalNationalityENIterator)findAncestorWithClass(this, DateTimeIntervalNationalityENIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getNationalityEN());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for nationalityEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for nationalityEN tag ");
		}
		return SKIP_BODY;
	}
}

