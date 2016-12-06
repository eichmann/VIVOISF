package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventHasResearchArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventHasResearchArea currentInstance = null;
	private static final Log log = LogFactory.getLog(EventHasResearchArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EventHasResearchAreaIterator theEventHasResearchAreaIterator = (EventHasResearchAreaIterator)findAncestorWithClass(this, EventHasResearchAreaIterator.class);
			pageContext.getOut().print(theEventHasResearchAreaIterator.getHasResearchArea());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

