package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalLandAreaUnitIterator theDateTimeInterval = (DateTimeIntervalLandAreaUnitIterator)findAncestorWithClass(this, DateTimeIntervalLandAreaUnitIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

