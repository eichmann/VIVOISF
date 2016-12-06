package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueNameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueNameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueNameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueNameCurrencyENIterator theDateTimeValue = (DateTimeValueNameCurrencyENIterator)findAncestorWithClass(this, DateTimeValueNameCurrencyENIterator.class);
			pageContext.getOut().print(theDateTimeValue.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}

