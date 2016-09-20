package edu.uiowa.slis.VIVOISF.DateTimeValuePrecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValuePrecisionRelatedInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValuePrecisionRelatedInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValuePrecisionRelatedInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeValuePrecisionRelatedInverseIterator theDateTimeValuePrecisionRelatedInverseIterator = (DateTimeValuePrecisionRelatedInverseIterator)findAncestorWithClass(this, DateTimeValuePrecisionRelatedInverseIterator.class);
			pageContext.getOut().print(theDateTimeValuePrecisionRelatedInverseIterator.getRelatedInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValuePrecision for related tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValuePrecision for related tag ");
		}
		return SKIP_BODY;
	}
}

