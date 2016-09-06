package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalRO_0000057Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalRO_0000057Type currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalRO_0000057Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalRO_0000057Iterator theDateTimeIntervalRO_0000057Iterator = (DateTimeIntervalRO_0000057Iterator)findAncestorWithClass(this, DateTimeIntervalRO_0000057Iterator.class);
			pageContext.getOut().print(theDateTimeIntervalRO_0000057Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for RO_0000057 tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for RO_0000057 tag ");
		}
		return SKIP_BODY;
	}
}

