package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventHasSubjectAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventHasSubjectAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(EventHasSubjectAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EventHasSubjectAreaIterator theEventHasSubjectAreaIterator = (EventHasSubjectAreaIterator)findAncestorWithClass(this, EventHasSubjectAreaIterator.class);
			pageContext.getOut().print(theEventHasSubjectAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

