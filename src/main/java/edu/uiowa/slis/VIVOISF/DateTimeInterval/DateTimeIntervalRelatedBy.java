package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalRelatedByIterator theDateTimeIntervalRelatedByIterator = (DateTimeIntervalRelatedByIterator)findAncestorWithClass(this, DateTimeIntervalRelatedByIterator.class);
			pageContext.getOut().print(theDateTimeIntervalRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

