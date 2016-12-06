package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalNameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalNameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalNameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalNameCurrencyFRIterator theDateTimeInterval = (DateTimeIntervalNameCurrencyFRIterator)findAncestorWithClass(this, DateTimeIntervalNameCurrencyFRIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

