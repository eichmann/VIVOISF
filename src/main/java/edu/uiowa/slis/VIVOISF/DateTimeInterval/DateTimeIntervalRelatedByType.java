package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalRelatedByIterator theDateTimeIntervalRelatedByIterator = (DateTimeIntervalRelatedByIterator)findAncestorWithClass(this, DateTimeIntervalRelatedByIterator.class);
			pageContext.getOut().print(theDateTimeIntervalRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

