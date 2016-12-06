package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(EventNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventNameShortITIterator theEvent = (EventNameShortITIterator)findAncestorWithClass(this, EventNameShortITIterator.class);
			pageContext.getOut().print(theEvent.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

