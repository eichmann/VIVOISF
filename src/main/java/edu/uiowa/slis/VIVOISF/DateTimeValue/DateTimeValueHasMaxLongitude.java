package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueHasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueHasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueHasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueHasMaxLongitudeIterator theDateTimeValue = (DateTimeValueHasMaxLongitudeIterator)findAncestorWithClass(this, DateTimeValueHasMaxLongitudeIterator.class);
			pageContext.getOut().print(theDateTimeValue.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}

