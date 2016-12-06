package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventNameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventNameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(EventNameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventNameCurrencyZHIterator theEvent = (EventNameCurrencyZHIterator)findAncestorWithClass(this, EventNameCurrencyZHIterator.class);
			pageContext.getOut().print(theEvent.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

