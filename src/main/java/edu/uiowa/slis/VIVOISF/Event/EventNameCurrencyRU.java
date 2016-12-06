package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventNameCurrencyRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventNameCurrencyRU currentInstance = null;
	private static final Log log = LogFactory.getLog(EventNameCurrencyRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventNameCurrencyRUIterator theEvent = (EventNameCurrencyRUIterator)findAncestorWithClass(this, EventNameCurrencyRUIterator.class);
			pageContext.getOut().print(theEvent.getNameCurrencyRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for nameCurrencyRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for nameCurrencyRU tag ");
		}
		return SKIP_BODY;
	}
}

