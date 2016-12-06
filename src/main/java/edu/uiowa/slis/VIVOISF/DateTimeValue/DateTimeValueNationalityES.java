package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueNationalityES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueNationalityES currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueNationalityES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueNationalityESIterator theDateTimeValue = (DateTimeValueNationalityESIterator)findAncestorWithClass(this, DateTimeValueNationalityESIterator.class);
			pageContext.getOut().print(theDateTimeValue.getNationalityES());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for nationalityES tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for nationalityES tag ");
		}
		return SKIP_BODY;
	}
}

