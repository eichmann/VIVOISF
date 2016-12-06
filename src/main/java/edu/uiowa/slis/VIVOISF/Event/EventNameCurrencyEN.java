package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventNameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventNameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(EventNameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventNameCurrencyENIterator theEvent = (EventNameCurrencyENIterator)findAncestorWithClass(this, EventNameCurrencyENIterator.class);
			pageContext.getOut().print(theEvent.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}

