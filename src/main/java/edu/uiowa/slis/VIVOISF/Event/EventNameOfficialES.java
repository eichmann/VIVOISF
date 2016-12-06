package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(EventNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventNameOfficialESIterator theEvent = (EventNameOfficialESIterator)findAncestorWithClass(this, EventNameOfficialESIterator.class);
			pageContext.getOut().print(theEvent.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

