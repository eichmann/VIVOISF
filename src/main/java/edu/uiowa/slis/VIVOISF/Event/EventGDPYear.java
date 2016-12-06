package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(EventGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventGDPYearIterator theEvent = (EventGDPYearIterator)findAncestorWithClass(this, EventGDPYearIterator.class);
			pageContext.getOut().print(theEvent.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

