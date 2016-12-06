package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueNationalityAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueNationalityAR currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueNationalityAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueNationalityARIterator theDateTimeValue = (DateTimeValueNationalityARIterator)findAncestorWithClass(this, DateTimeValueNationalityARIterator.class);
			pageContext.getOut().print(theDateTimeValue.getNationalityAR());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for nationalityAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for nationalityAR tag ");
		}
		return SKIP_BODY;
	}
}

