package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventRO_0000057Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventRO_0000057Type currentInstance = null;
	private static final Log log = LogFactory.getLog(EventRO_0000057Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EventRO_0000057Iterator theEventRO_0000057Iterator = (EventRO_0000057Iterator)findAncestorWithClass(this, EventRO_0000057Iterator.class);
			pageContext.getOut().print(theEventRO_0000057Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for RO_0000057 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for RO_0000057 tag ");
		}
		return SKIP_BODY;
	}
}

