package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalNameCurrencyRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalNameCurrencyRU currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalNameCurrencyRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalNameCurrencyRUIterator theDateTimeInterval = (DateTimeIntervalNameCurrencyRUIterator)findAncestorWithClass(this, DateTimeIntervalNameCurrencyRUIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getNameCurrencyRU());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for nameCurrencyRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for nameCurrencyRU tag ");
		}
		return SKIP_BODY;
	}
}

