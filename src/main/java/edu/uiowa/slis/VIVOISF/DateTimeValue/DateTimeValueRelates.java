package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueRelates extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueRelates currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueRelates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueRelatesIterator theDateTimeValueRelatesIterator = (DateTimeValueRelatesIterator)findAncestorWithClass(this, DateTimeValueRelatesIterator.class);
			pageContext.getOut().print(theDateTimeValueRelatesIterator.getRelates());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for relates tag ");
		}
		return SKIP_BODY;
	}
}

