package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(EventCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventCodeAGROVOCIterator theEvent = (EventCodeAGROVOCIterator)findAncestorWithClass(this, EventCodeAGROVOCIterator.class);
			pageContext.getOut().print(theEvent.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}

