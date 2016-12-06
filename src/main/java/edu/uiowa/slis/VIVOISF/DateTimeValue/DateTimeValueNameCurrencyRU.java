package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueNameCurrencyRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueNameCurrencyRU currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueNameCurrencyRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueNameCurrencyRUIterator theDateTimeValue = (DateTimeValueNameCurrencyRUIterator)findAncestorWithClass(this, DateTimeValueNameCurrencyRUIterator.class);
			pageContext.getOut().print(theDateTimeValue.getNameCurrencyRU());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for nameCurrencyRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for nameCurrencyRU tag ");
		}
		return SKIP_BODY;
	}
}

