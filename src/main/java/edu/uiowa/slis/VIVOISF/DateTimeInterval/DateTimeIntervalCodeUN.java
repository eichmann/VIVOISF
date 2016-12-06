package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalCodeUNIterator theDateTimeInterval = (DateTimeIntervalCodeUNIterator)findAncestorWithClass(this, DateTimeIntervalCodeUNIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

