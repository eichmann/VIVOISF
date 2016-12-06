package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalAgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalAgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalAgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalAgriculturalAreaTotalIterator theDateTimeInterval = (DateTimeIntervalAgriculturalAreaTotalIterator)findAncestorWithClass(this, DateTimeIntervalAgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

