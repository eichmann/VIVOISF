package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventRelates extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventRelates currentInstance = null;
	private static final Log log = LogFactory.getLog(EventRelates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EventRelatesIterator theEventRelatesIterator = (EventRelatesIterator)findAncestorWithClass(this, EventRelatesIterator.class);
			pageContext.getOut().print(theEventRelatesIterator.getRelates());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for relates tag ");
		}
		return SKIP_BODY;
	}
}

