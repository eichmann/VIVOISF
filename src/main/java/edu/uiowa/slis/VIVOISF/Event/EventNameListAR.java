package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(EventNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventNameListARIterator theEvent = (EventNameListARIterator)findAncestorWithClass(this, EventNameListARIterator.class);
			pageContext.getOut().print(theEvent.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

