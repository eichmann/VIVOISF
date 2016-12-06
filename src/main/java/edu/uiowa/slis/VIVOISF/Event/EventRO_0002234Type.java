package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventRO_0002234Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventRO_0002234Type currentInstance = null;
	private static final Log log = LogFactory.getLog(EventRO_0002234Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EventRO_0002234Iterator theEventRO_0002234Iterator = (EventRO_0002234Iterator)findAncestorWithClass(this, EventRO_0002234Iterator.class);
			pageContext.getOut().print(theEventRO_0002234Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for RO_0002234 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for RO_0002234 tag ");
		}
		return SKIP_BODY;
	}
}

