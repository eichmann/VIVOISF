package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalHasAddressType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalHasAddressType currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalHasAddressType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalHasAddressIterator theDateTimeIntervalHasAddressIterator = (DateTimeIntervalHasAddressIterator)findAncestorWithClass(this, DateTimeIntervalHasAddressIterator.class);
			pageContext.getOut().print(theDateTimeIntervalHasAddressIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

