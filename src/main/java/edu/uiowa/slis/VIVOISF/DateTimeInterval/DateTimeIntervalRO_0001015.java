package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalRO_0001015 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalRO_0001015 currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalRO_0001015.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalRO_0001015Iterator theDateTimeIntervalRO_0001015Iterator = (DateTimeIntervalRO_0001015Iterator)findAncestorWithClass(this, DateTimeIntervalRO_0001015Iterator.class);
			pageContext.getOut().print(theDateTimeIntervalRO_0001015Iterator.getRO_0001015());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for RO_0001015 tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for RO_0001015 tag ");
		}
		return SKIP_BODY;
	}
}

