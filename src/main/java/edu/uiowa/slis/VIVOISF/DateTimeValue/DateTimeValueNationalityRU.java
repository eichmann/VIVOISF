package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueNationalityRUIterator theDateTimeValue = (DateTimeValueNationalityRUIterator)findAncestorWithClass(this, DateTimeValueNationalityRUIterator.class);
			pageContext.getOut().print(theDateTimeValue.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

