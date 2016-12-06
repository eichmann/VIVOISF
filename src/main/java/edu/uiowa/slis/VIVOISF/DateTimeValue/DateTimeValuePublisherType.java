package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValuePublisherType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValuePublisherType currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValuePublisherType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeValuePublisherIterator theDateTimeValuePublisherIterator = (DateTimeValuePublisherIterator)findAncestorWithClass(this, DateTimeValuePublisherIterator.class);
			pageContext.getOut().print(theDateTimeValuePublisherIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for publisher tag ");
		}
		return SKIP_BODY;
	}
}
