package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(EventCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventCodeUNDPIterator theEvent = (EventCodeUNDPIterator)findAncestorWithClass(this, EventCodeUNDPIterator.class);
			pageContext.getOut().print(theEvent.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}

