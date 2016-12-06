package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueNameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueNameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueNameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueNameCurrencyITIterator theDateTimeValue = (DateTimeValueNameCurrencyITIterator)findAncestorWithClass(this, DateTimeValueNameCurrencyITIterator.class);
			pageContext.getOut().print(theDateTimeValue.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

