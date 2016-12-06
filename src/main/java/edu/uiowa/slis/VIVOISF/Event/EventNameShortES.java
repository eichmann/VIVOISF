package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(EventNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventNameShortESIterator theEvent = (EventNameShortESIterator)findAncestorWithClass(this, EventNameShortESIterator.class);
			pageContext.getOut().print(theEvent.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

