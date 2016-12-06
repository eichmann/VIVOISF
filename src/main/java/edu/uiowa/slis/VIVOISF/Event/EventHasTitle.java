package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventHasTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventHasTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(EventHasTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EventHasTitleIterator theEventHasTitleIterator = (EventHasTitleIterator)findAncestorWithClass(this, EventHasTitleIterator.class);
			pageContext.getOut().print(theEventHasTitleIterator.getHasTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

