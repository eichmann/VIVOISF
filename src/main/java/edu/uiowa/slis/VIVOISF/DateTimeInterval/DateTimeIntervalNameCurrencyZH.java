package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalNameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalNameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalNameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalNameCurrencyZHIterator theDateTimeInterval = (DateTimeIntervalNameCurrencyZHIterator)findAncestorWithClass(this, DateTimeIntervalNameCurrencyZHIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

