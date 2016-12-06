package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueHDIYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueHDIYear currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueHDIYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueHDIYearIterator theDateTimeValue = (DateTimeValueHDIYearIterator)findAncestorWithClass(this, DateTimeValueHDIYearIterator.class);
			pageContext.getOut().print(theDateTimeValue.getHDIYear());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for HDIYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for HDIYear tag ");
		}
		return SKIP_BODY;
	}
}

