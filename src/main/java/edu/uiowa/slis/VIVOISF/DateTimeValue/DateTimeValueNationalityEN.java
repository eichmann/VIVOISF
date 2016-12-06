package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueNationalityEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueNationalityEN currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueNationalityEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueNationalityENIterator theDateTimeValue = (DateTimeValueNationalityENIterator)findAncestorWithClass(this, DateTimeValueNationalityENIterator.class);
			pageContext.getOut().print(theDateTimeValue.getNationalityEN());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for nationalityEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for nationalityEN tag ");
		}
		return SKIP_BODY;
	}
}

