package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueGeographicFocus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueGeographicFocus currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueGeographicFocus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueGeographicFocusIterator theDateTimeValueGeographicFocusIterator = (DateTimeValueGeographicFocusIterator)findAncestorWithClass(this, DateTimeValueGeographicFocusIterator.class);
			pageContext.getOut().print(theDateTimeValueGeographicFocusIterator.getGeographicFocus());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

