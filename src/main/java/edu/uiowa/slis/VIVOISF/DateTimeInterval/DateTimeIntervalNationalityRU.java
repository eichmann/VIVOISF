package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalNationalityRUIterator theDateTimeInterval = (DateTimeIntervalNationalityRUIterator)findAncestorWithClass(this, DateTimeIntervalNationalityRUIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

