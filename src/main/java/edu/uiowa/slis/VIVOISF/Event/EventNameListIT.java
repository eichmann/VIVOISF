package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(EventNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventNameListITIterator theEvent = (EventNameListITIterator)findAncestorWithClass(this, EventNameListITIterator.class);
			pageContext.getOut().print(theEvent.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

