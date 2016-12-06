package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalNationalityES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalNationalityES currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalNationalityES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalNationalityESIterator theDateTimeInterval = (DateTimeIntervalNationalityESIterator)findAncestorWithClass(this, DateTimeIntervalNationalityESIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getNationalityES());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for nationalityES tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for nationalityES tag ");
		}
		return SKIP_BODY;
	}
}

