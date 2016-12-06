package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueNameOfficialENIterator theDateTimeValue = (DateTimeValueNameOfficialENIterator)findAncestorWithClass(this, DateTimeValueNameOfficialENIterator.class);
			pageContext.getOut().print(theDateTimeValue.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

