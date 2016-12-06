package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(EventNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventNameOfficialITIterator theEvent = (EventNameOfficialITIterator)findAncestorWithClass(this, EventNameOfficialITIterator.class);
			pageContext.getOut().print(theEvent.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

