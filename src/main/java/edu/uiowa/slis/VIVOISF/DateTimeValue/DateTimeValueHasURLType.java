package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueHasURLType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueHasURLType currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueHasURLType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueHasURLIterator theDateTimeValueHasURLIterator = (DateTimeValueHasURLIterator)findAncestorWithClass(this, DateTimeValueHasURLIterator.class);
			pageContext.getOut().print(theDateTimeValueHasURLIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

