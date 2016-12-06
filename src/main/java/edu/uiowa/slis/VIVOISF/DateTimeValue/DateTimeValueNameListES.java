package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueNameListESIterator theDateTimeValue = (DateTimeValueNameListESIterator)findAncestorWithClass(this, DateTimeValueNameListESIterator.class);
			pageContext.getOut().print(theDateTimeValue.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

