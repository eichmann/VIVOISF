package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalNationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalNationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalNationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalNationalityITIterator theDateTimeInterval = (DateTimeIntervalNationalityITIterator)findAncestorWithClass(this, DateTimeIntervalNationalityITIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

