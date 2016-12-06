package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(EventNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventNameShortZHIterator theEvent = (EventNameShortZHIterator)findAncestorWithClass(this, EventNameShortZHIterator.class);
			pageContext.getOut().print(theEvent.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

