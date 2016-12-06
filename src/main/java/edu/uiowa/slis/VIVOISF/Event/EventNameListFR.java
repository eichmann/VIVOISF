package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(EventNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventNameListFRIterator theEvent = (EventNameListFRIterator)findAncestorWithClass(this, EventNameListFRIterator.class);
			pageContext.getOut().print(theEvent.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

