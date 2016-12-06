package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueNationalityFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueNationalityFR currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueNationalityFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueNationalityFRIterator theDateTimeValue = (DateTimeValueNationalityFRIterator)findAncestorWithClass(this, DateTimeValueNationalityFRIterator.class);
			pageContext.getOut().print(theDateTimeValue.getNationalityFR());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for nationalityFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for nationalityFR tag ");
		}
		return SKIP_BODY;
	}
}

