package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueHasMinLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueHasMinLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueHasMinLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueHasMinLatitudeIterator theDateTimeValue = (DateTimeValueHasMinLatitudeIterator)findAncestorWithClass(this, DateTimeValueHasMinLatitudeIterator.class);
			pageContext.getOut().print(theDateTimeValue.getHasMinLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for hasMinLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for hasMinLatitude tag ");
		}
		return SKIP_BODY;
	}
}

