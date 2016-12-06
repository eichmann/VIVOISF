package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(EventCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventCodeUNIterator theEvent = (EventCodeUNIterator)findAncestorWithClass(this, EventCodeUNIterator.class);
			pageContext.getOut().print(theEvent.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

