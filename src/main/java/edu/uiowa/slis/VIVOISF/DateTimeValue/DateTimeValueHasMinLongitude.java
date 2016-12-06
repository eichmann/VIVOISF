package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueHasMinLongitudeIterator theDateTimeValue = (DateTimeValueHasMinLongitudeIterator)findAncestorWithClass(this, DateTimeValueHasMinLongitudeIterator.class);
			pageContext.getOut().print(theDateTimeValue.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

