package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueNameShortZHIterator theDateTimeValue = (DateTimeValueNameShortZHIterator)findAncestorWithClass(this, DateTimeValueNameShortZHIterator.class);
			pageContext.getOut().print(theDateTimeValue.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

