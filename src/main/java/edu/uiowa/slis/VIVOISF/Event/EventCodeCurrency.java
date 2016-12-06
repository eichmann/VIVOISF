package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventCodeCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventCodeCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(EventCodeCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventCodeCurrencyIterator theEvent = (EventCodeCurrencyIterator)findAncestorWithClass(this, EventCodeCurrencyIterator.class);
			pageContext.getOut().print(theEvent.getCodeCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for codeCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for codeCurrency tag ");
		}
		return SKIP_BODY;
	}
}

