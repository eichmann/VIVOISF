package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalNationalityFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalNationalityFR currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalNationalityFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalNationalityFRIterator theDateTimeInterval = (DateTimeIntervalNationalityFRIterator)findAncestorWithClass(this, DateTimeIntervalNationalityFRIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getNationalityFR());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for nationalityFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for nationalityFR tag ");
		}
		return SKIP_BODY;
	}
}

