package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueNameShortFRIterator theDateTimeValue = (DateTimeValueNameShortFRIterator)findAncestorWithClass(this, DateTimeValueNameShortFRIterator.class);
			pageContext.getOut().print(theDateTimeValue.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

