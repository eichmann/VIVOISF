package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalGDPUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalGDPUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalGDPUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalGDPUnitIterator theDateTimeInterval = (DateTimeIntervalGDPUnitIterator)findAncestorWithClass(this, DateTimeIntervalGDPUnitIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getGDPUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for GDPUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for GDPUnit tag ");
		}
		return SKIP_BODY;
	}
}

