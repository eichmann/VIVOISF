package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueNameShortITIterator theDateTimeValue = (DateTimeValueNameShortITIterator)findAncestorWithClass(this, DateTimeValueNameShortITIterator.class);
			pageContext.getOut().print(theDateTimeValue.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

