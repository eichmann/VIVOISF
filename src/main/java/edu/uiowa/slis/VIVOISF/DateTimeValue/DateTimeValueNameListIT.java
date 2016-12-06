package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueNameListITIterator theDateTimeValue = (DateTimeValueNameListITIterator)findAncestorWithClass(this, DateTimeValueNameListITIterator.class);
			pageContext.getOut().print(theDateTimeValue.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

