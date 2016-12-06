package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(EventNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventNameShortARIterator theEvent = (EventNameShortARIterator)findAncestorWithClass(this, EventNameShortARIterator.class);
			pageContext.getOut().print(theEvent.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

