package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueGDPUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueGDPUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueGDPUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueGDPUnitIterator theDateTimeValue = (DateTimeValueGDPUnitIterator)findAncestorWithClass(this, DateTimeValueGDPUnitIterator.class);
			pageContext.getOut().print(theDateTimeValue.getGDPUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for GDPUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for GDPUnit tag ");
		}
		return SKIP_BODY;
	}
}

