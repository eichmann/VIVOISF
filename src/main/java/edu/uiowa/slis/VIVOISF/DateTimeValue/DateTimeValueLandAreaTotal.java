package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueLandAreaTotalIterator theDateTimeValue = (DateTimeValueLandAreaTotalIterator)findAncestorWithClass(this, DateTimeValueLandAreaTotalIterator.class);
			pageContext.getOut().print(theDateTimeValue.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

