package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueNameListARIterator theDateTimeValue = (DateTimeValueNameListARIterator)findAncestorWithClass(this, DateTimeValueNameListARIterator.class);
			pageContext.getOut().print(theDateTimeValue.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

