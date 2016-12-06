package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalBFO_0000050 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalBFO_0000050 currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalBFO_0000050.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalBFO_0000050Iterator theDateTimeIntervalBFO_0000050Iterator = (DateTimeIntervalBFO_0000050Iterator)findAncestorWithClass(this, DateTimeIntervalBFO_0000050Iterator.class);
			pageContext.getOut().print(theDateTimeIntervalBFO_0000050Iterator.getBFO_0000050());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for BFO_0000050 tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for BFO_0000050 tag ");
		}
		return SKIP_BODY;
	}
}

