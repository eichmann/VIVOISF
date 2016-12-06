package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueNameShortRUIterator theDateTimeValue = (DateTimeValueNameShortRUIterator)findAncestorWithClass(this, DateTimeValueNameShortRUIterator.class);
			pageContext.getOut().print(theDateTimeValue.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

