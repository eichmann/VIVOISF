package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalAgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalAgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalAgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalAgriculturalAreaUnitIterator theDateTimeInterval = (DateTimeIntervalAgriculturalAreaUnitIterator)findAncestorWithClass(this, DateTimeIntervalAgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

