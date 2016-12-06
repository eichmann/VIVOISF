package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalHDITotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalHDITotal currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalHDITotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalHDITotalIterator theDateTimeInterval = (DateTimeIntervalHDITotalIterator)findAncestorWithClass(this, DateTimeIntervalHDITotalIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getHDITotal());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for HDITotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for HDITotal tag ");
		}
		return SKIP_BODY;
	}
}

