package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueGeographicFocusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueGeographicFocusType currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueGeographicFocusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueGeographicFocusIterator theDateTimeValueGeographicFocusIterator = (DateTimeValueGeographicFocusIterator)findAncestorWithClass(this, DateTimeValueGeographicFocusIterator.class);
			pageContext.getOut().print(theDateTimeValueGeographicFocusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

