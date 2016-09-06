package edu.uiowa.slis.VIVOISF.DateTimeValuePrecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValuePrecisionBroader extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValuePrecisionBroader currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValuePrecisionBroader.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeValuePrecisionBroaderIterator theDateTimeValuePrecisionBroaderIterator = (DateTimeValuePrecisionBroaderIterator)findAncestorWithClass(this, DateTimeValuePrecisionBroaderIterator.class);
			pageContext.getOut().print(theDateTimeValuePrecisionBroaderIterator.getBroader());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValuePrecision for broader tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValuePrecision for broader tag ");
		}
		return SKIP_BODY;
	}
}

