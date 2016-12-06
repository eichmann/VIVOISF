package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueAgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueAgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueAgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueAgriculturalAreaUnitIterator theDateTimeValue = (DateTimeValueAgriculturalAreaUnitIterator)findAncestorWithClass(this, DateTimeValueAgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(theDateTimeValue.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

