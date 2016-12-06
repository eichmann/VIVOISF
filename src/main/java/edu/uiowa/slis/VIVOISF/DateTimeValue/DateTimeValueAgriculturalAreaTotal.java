package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueAgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueAgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueAgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueAgriculturalAreaTotalIterator theDateTimeValue = (DateTimeValueAgriculturalAreaTotalIterator)findAncestorWithClass(this, DateTimeValueAgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(theDateTimeValue.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

