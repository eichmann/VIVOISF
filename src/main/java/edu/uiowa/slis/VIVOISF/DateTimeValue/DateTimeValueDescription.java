package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueDescriptionIterator theDateTimeValue = (DateTimeValueDescriptionIterator)findAncestorWithClass(this, DateTimeValueDescriptionIterator.class);
			pageContext.getOut().print(theDateTimeValue.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for description tag ");
		}
		return SKIP_BODY;
	}
}

