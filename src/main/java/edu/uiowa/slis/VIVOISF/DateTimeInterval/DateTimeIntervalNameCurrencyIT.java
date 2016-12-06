package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalNameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalNameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalNameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalNameCurrencyITIterator theDateTimeInterval = (DateTimeIntervalNameCurrencyITIterator)findAncestorWithClass(this, DateTimeIntervalNameCurrencyITIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

