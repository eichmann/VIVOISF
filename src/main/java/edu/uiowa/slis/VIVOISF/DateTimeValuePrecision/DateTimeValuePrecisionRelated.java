package edu.uiowa.slis.VIVOISF.DateTimeValuePrecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValuePrecisionRelated extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValuePrecisionRelated currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValuePrecisionRelated.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeValuePrecisionRelatedIterator theDateTimeValuePrecisionRelatedIterator = (DateTimeValuePrecisionRelatedIterator)findAncestorWithClass(this, DateTimeValuePrecisionRelatedIterator.class);
			pageContext.getOut().print(theDateTimeValuePrecisionRelatedIterator.getRelated());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValuePrecision for related tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValuePrecision for related tag ");
		}
		return SKIP_BODY;
	}
}

