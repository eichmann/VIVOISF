package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueNationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueNationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueNationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueNationalityITIterator theDateTimeValue = (DateTimeValueNationalityITIterator)findAncestorWithClass(this, DateTimeValueNationalityITIterator.class);
			pageContext.getOut().print(theDateTimeValue.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

