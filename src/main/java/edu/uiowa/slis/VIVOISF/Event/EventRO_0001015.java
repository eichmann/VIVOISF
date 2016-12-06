package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventRO_0001015 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventRO_0001015 currentInstance = null;
	private static final Log log = LogFactory.getLog(EventRO_0001015.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EventRO_0001015Iterator theEventRO_0001015Iterator = (EventRO_0001015Iterator)findAncestorWithClass(this, EventRO_0001015Iterator.class);
			pageContext.getOut().print(theEventRO_0001015Iterator.getRO_0001015());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for RO_0001015 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for RO_0001015 tag ");
		}
		return SKIP_BODY;
	}
}

