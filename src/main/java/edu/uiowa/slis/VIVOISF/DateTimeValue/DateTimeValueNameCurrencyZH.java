package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueNameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueNameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueNameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueNameCurrencyZHIterator theDateTimeValue = (DateTimeValueNameCurrencyZHIterator)findAncestorWithClass(this, DateTimeValueNameCurrencyZHIterator.class);
			pageContext.getOut().print(theDateTimeValue.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

