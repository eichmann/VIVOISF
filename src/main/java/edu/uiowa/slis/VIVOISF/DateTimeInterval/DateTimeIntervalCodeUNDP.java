package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalCodeUNDPIterator theDateTimeInterval = (DateTimeIntervalCodeUNDPIterator)findAncestorWithClass(this, DateTimeIntervalCodeUNDPIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}

