package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventPresentsType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventPresentsType currentInstance = null;
	private static final Log log = LogFactory.getLog(EventPresentsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EventPresentsIterator theEventPresentsIterator = (EventPresentsIterator)findAncestorWithClass(this, EventPresentsIterator.class);
			pageContext.getOut().print(theEventPresentsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for presents tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for presents tag ");
		}
		return SKIP_BODY;
	}
}

