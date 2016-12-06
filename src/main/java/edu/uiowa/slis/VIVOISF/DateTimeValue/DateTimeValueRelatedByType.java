package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueRelatedByIterator theDateTimeValueRelatedByIterator = (DateTimeValueRelatedByIterator)findAncestorWithClass(this, DateTimeValueRelatedByIterator.class);
			pageContext.getOut().print(theDateTimeValueRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

