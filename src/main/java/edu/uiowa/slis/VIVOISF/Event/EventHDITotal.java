package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventHDITotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventHDITotal currentInstance = null;
	private static final Log log = LogFactory.getLog(EventHDITotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventHDITotalIterator theEvent = (EventHDITotalIterator)findAncestorWithClass(this, EventHDITotalIterator.class);
			pageContext.getOut().print(theEvent.getHDITotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for HDITotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for HDITotal tag ");
		}
		return SKIP_BODY;
	}
}

