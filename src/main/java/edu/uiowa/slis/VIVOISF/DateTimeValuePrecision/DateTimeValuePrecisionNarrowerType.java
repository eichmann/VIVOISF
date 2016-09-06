package edu.uiowa.slis.VIVOISF.DateTimeValuePrecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValuePrecisionNarrowerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValuePrecisionNarrowerType currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValuePrecisionNarrowerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeValuePrecisionNarrowerIterator theDateTimeValuePrecisionNarrowerIterator = (DateTimeValuePrecisionNarrowerIterator)findAncestorWithClass(this, DateTimeValuePrecisionNarrowerIterator.class);
			pageContext.getOut().print(theDateTimeValuePrecisionNarrowerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValuePrecision for narrower tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValuePrecision for narrower tag ");
		}
		return SKIP_BODY;
	}
}

