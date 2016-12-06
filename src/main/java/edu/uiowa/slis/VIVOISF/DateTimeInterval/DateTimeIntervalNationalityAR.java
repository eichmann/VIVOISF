package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalNationalityAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalNationalityAR currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalNationalityAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalNationalityARIterator theDateTimeInterval = (DateTimeIntervalNationalityARIterator)findAncestorWithClass(this, DateTimeIntervalNationalityARIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getNationalityAR());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for nationalityAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for nationalityAR tag ");
		}
		return SKIP_BODY;
	}
}

