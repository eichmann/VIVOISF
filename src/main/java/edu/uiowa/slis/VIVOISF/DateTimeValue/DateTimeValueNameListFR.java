package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueNameListFRIterator theDateTimeValue = (DateTimeValueNameListFRIterator)findAncestorWithClass(this, DateTimeValueNameListFRIterator.class);
			pageContext.getOut().print(theDateTimeValue.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

