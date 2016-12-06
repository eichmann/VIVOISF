package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueNameCurrencyESIterator theDateTimeValue = (DateTimeValueNameCurrencyESIterator)findAncestorWithClass(this, DateTimeValueNameCurrencyESIterator.class);
			pageContext.getOut().print(theDateTimeValue.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

