package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueHasMaxLatitudeIterator theDateTimeValue = (DateTimeValueHasMaxLatitudeIterator)findAncestorWithClass(this, DateTimeValueHasMaxLatitudeIterator.class);
			pageContext.getOut().print(theDateTimeValue.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

