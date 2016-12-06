package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalRO_0002353Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalRO_0002353Type currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalRO_0002353Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalRO_0002353Iterator theDateTimeIntervalRO_0002353Iterator = (DateTimeIntervalRO_0002353Iterator)findAncestorWithClass(this, DateTimeIntervalRO_0002353Iterator.class);
			pageContext.getOut().print(theDateTimeIntervalRO_0002353Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}

