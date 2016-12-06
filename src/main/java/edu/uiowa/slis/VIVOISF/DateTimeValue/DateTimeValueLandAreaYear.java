package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueLandAreaYearIterator theDateTimeValue = (DateTimeValueLandAreaYearIterator)findAncestorWithClass(this, DateTimeValueLandAreaYearIterator.class);
			pageContext.getOut().print(theDateTimeValue.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

