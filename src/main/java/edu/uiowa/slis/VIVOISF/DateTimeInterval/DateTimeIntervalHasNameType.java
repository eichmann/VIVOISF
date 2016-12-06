package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalHasNameType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalHasNameType currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalHasNameType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalHasNameIterator theDateTimeIntervalHasNameIterator = (DateTimeIntervalHasNameIterator)findAncestorWithClass(this, DateTimeIntervalHasNameIterator.class);
			pageContext.getOut().print(theDateTimeIntervalHasNameIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for hasName tag ");
		}
		return SKIP_BODY;
	}
}

