package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueHDITotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueHDITotal currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueHDITotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueHDITotalIterator theDateTimeValue = (DateTimeValueHDITotalIterator)findAncestorWithClass(this, DateTimeValueHDITotalIterator.class);
			pageContext.getOut().print(theDateTimeValue.getHDITotal());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for HDITotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for HDITotal tag ");
		}
		return SKIP_BODY;
	}
}

