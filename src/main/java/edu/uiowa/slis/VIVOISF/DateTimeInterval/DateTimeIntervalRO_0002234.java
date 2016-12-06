package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalRO_0002234 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalRO_0002234 currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalRO_0002234.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalRO_0002234Iterator theDateTimeIntervalRO_0002234Iterator = (DateTimeIntervalRO_0002234Iterator)findAncestorWithClass(this, DateTimeIntervalRO_0002234Iterator.class);
			pageContext.getOut().print(theDateTimeIntervalRO_0002234Iterator.getRO_0002234());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for RO_0002234 tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for RO_0002234 tag ");
		}
		return SKIP_BODY;
	}
}

