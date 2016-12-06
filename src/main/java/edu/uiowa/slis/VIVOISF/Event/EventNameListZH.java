package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(EventNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventNameListZHIterator theEvent = (EventNameListZHIterator)findAncestorWithClass(this, EventNameListZHIterator.class);
			pageContext.getOut().print(theEvent.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

