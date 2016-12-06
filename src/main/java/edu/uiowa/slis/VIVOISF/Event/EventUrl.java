package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(EventUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventUrlIterator theEvent = (EventUrlIterator)findAncestorWithClass(this, EventUrlIterator.class);
			pageContext.getOut().print(theEvent.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for url tag ");
		}
		return SKIP_BODY;
	}
}

