package edu.uiowa.slis.VIVOISF.DateTimeValuePrecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValuePrecisionDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValuePrecisionDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValuePrecisionDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValuePrecisionDescriptionIterator theDateTimeValuePrecision = (DateTimeValuePrecisionDescriptionIterator)findAncestorWithClass(this, DateTimeValuePrecisionDescriptionIterator.class);
			pageContext.getOut().print(theDateTimeValuePrecision.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValuePrecision for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValuePrecision for description tag ");
		}
		return SKIP_BODY;
	}
}

