package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventNameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventNameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(EventNameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventNameCurrencyARIterator theEvent = (EventNameCurrencyARIterator)findAncestorWithClass(this, EventNameCurrencyARIterator.class);
			pageContext.getOut().print(theEvent.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

