package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(EventNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventNameCurrencyESIterator theEvent = (EventNameCurrencyESIterator)findAncestorWithClass(this, EventNameCurrencyESIterator.class);
			pageContext.getOut().print(theEvent.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

