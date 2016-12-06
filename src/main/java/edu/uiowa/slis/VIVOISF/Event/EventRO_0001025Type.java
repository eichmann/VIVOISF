package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventRO_0001025Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventRO_0001025Type currentInstance = null;
	private static final Log log = LogFactory.getLog(EventRO_0001025Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EventRO_0001025Iterator theEventRO_0001025Iterator = (EventRO_0001025Iterator)findAncestorWithClass(this, EventRO_0001025Iterator.class);
			pageContext.getOut().print(theEventRO_0001025Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}

