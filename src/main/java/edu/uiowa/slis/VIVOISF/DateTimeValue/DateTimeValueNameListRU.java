package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueNameListRUIterator theDateTimeValue = (DateTimeValueNameListRUIterator)findAncestorWithClass(this, DateTimeValueNameListRUIterator.class);
			pageContext.getOut().print(theDateTimeValue.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

