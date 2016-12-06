package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalRO_0001025Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalRO_0001025Type currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalRO_0001025Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalRO_0001025Iterator theDateTimeIntervalRO_0001025Iterator = (DateTimeIntervalRO_0001025Iterator)findAncestorWithClass(this, DateTimeIntervalRO_0001025Iterator.class);
			pageContext.getOut().print(theDateTimeIntervalRO_0001025Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}

