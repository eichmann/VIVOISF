package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalBFO_0000051 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalBFO_0000051 currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalBFO_0000051.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalBFO_0000051Iterator theDateTimeIntervalBFO_0000051Iterator = (DateTimeIntervalBFO_0000051Iterator)findAncestorWithClass(this, DateTimeIntervalBFO_0000051Iterator.class);
			pageContext.getOut().print(theDateTimeIntervalBFO_0000051Iterator.getBFO_0000051());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for BFO_0000051 tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for BFO_0000051 tag ");
		}
		return SKIP_BODY;
	}
}

