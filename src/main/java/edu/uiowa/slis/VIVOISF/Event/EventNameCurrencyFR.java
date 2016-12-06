package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventNameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventNameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(EventNameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventNameCurrencyFRIterator theEvent = (EventNameCurrencyFRIterator)findAncestorWithClass(this, EventNameCurrencyFRIterator.class);
			pageContext.getOut().print(theEvent.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

