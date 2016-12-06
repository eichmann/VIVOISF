package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueHasURL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueHasURL currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueHasURL.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueHasURLIterator theDateTimeValueHasURLIterator = (DateTimeValueHasURLIterator)findAncestorWithClass(this, DateTimeValueHasURLIterator.class);
			pageContext.getOut().print(theDateTimeValueHasURLIterator.getHasURL());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

