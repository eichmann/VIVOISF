package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueNameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueNameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueNameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueNameCurrencyARIterator theDateTimeValue = (DateTimeValueNameCurrencyARIterator)findAncestorWithClass(this, DateTimeValueNameCurrencyARIterator.class);
			pageContext.getOut().print(theDateTimeValue.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

