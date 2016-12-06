package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueNameOfficialARIterator theDateTimeValue = (DateTimeValueNameOfficialARIterator)findAncestorWithClass(this, DateTimeValueNameOfficialARIterator.class);
			pageContext.getOut().print(theDateTimeValue.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

