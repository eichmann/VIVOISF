package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueGDPYearIterator theDateTimeValue = (DateTimeValueGDPYearIterator)findAncestorWithClass(this, DateTimeValueGDPYearIterator.class);
			pageContext.getOut().print(theDateTimeValue.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

