package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueStartInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueStartInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueStartInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueStartInverseIterator theDateTimeValueStartInverseIterator = (DateTimeValueStartInverseIterator)findAncestorWithClass(this, DateTimeValueStartInverseIterator.class);
			pageContext.getOut().print(theDateTimeValueStartInverseIterator.getStartInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for start tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for start tag ");
		}
		return SKIP_BODY;
	}
}

