package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueHasAddressType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueHasAddressType currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueHasAddressType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueHasAddressIterator theDateTimeValueHasAddressIterator = (DateTimeValueHasAddressIterator)findAncestorWithClass(this, DateTimeValueHasAddressIterator.class);
			pageContext.getOut().print(theDateTimeValueHasAddressIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

