package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueHasNameType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueHasNameType currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueHasNameType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueHasNameIterator theDateTimeValueHasNameIterator = (DateTimeValueHasNameIterator)findAncestorWithClass(this, DateTimeValueHasNameIterator.class);
			pageContext.getOut().print(theDateTimeValueHasNameIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for hasName tag ");
		}
		return SKIP_BODY;
	}
}

