package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(EventCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventCodeFAOSTATIterator theEvent = (EventCodeFAOSTATIterator)findAncestorWithClass(this, EventCodeFAOSTATIterator.class);
			pageContext.getOut().print(theEvent.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}

