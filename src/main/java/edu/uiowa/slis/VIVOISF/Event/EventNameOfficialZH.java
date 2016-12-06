package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(EventNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventNameOfficialZHIterator theEvent = (EventNameOfficialZHIterator)findAncestorWithClass(this, EventNameOfficialZHIterator.class);
			pageContext.getOut().print(theEvent.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

