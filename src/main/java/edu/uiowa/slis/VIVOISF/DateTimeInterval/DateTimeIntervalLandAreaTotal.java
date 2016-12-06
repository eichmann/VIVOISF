package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalLandAreaTotalIterator theDateTimeInterval = (DateTimeIntervalLandAreaTotalIterator)findAncestorWithClass(this, DateTimeIntervalLandAreaTotalIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

