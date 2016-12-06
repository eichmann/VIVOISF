package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueCodeCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueCodeCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueCodeCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueCodeCurrencyIterator theDateTimeValue = (DateTimeValueCodeCurrencyIterator)findAncestorWithClass(this, DateTimeValueCodeCurrencyIterator.class);
			pageContext.getOut().print(theDateTimeValue.getCodeCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for codeCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for codeCurrency tag ");
		}
		return SKIP_BODY;
	}
}

