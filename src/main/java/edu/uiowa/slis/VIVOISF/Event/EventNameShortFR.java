package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(EventNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventNameShortFRIterator theEvent = (EventNameShortFRIterator)findAncestorWithClass(this, EventNameShortFRIterator.class);
			pageContext.getOut().print(theEvent.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

