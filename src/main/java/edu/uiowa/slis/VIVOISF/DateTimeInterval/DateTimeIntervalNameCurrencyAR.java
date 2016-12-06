package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalNameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalNameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalNameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalNameCurrencyARIterator theDateTimeInterval = (DateTimeIntervalNameCurrencyARIterator)findAncestorWithClass(this, DateTimeIntervalNameCurrencyARIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

