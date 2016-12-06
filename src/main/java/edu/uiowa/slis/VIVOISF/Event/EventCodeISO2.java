package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(EventCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventCodeISO2Iterator theEvent = (EventCodeISO2Iterator)findAncestorWithClass(this, EventCodeISO2Iterator.class);
			pageContext.getOut().print(theEvent.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}

