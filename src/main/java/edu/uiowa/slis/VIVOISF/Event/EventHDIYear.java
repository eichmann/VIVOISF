package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventHDIYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventHDIYear currentInstance = null;
	private static final Log log = LogFactory.getLog(EventHDIYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventHDIYearIterator theEvent = (EventHDIYearIterator)findAncestorWithClass(this, EventHDIYearIterator.class);
			pageContext.getOut().print(theEvent.getHDIYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for HDIYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for HDIYear tag ");
		}
		return SKIP_BODY;
	}
}

