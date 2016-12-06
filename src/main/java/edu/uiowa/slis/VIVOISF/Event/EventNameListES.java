package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(EventNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventNameListESIterator theEvent = (EventNameListESIterator)findAncestorWithClass(this, EventNameListESIterator.class);
			pageContext.getOut().print(theEvent.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

