package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalNameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalNameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalNameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalNameCurrencyENIterator theDateTimeInterval = (DateTimeIntervalNameCurrencyENIterator)findAncestorWithClass(this, DateTimeIntervalNameCurrencyENIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}
