package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueAgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueAgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueAgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueAgriculturalAreaYearIterator theDateTimeValue = (DateTimeValueAgriculturalAreaYearIterator)findAncestorWithClass(this, DateTimeValueAgriculturalAreaYearIterator.class);
			pageContext.getOut().print(theDateTimeValue.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

