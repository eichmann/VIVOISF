package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(EventNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventNameOfficialFRIterator theEvent = (EventNameOfficialFRIterator)findAncestorWithClass(this, EventNameOfficialFRIterator.class);
			pageContext.getOut().print(theEvent.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

