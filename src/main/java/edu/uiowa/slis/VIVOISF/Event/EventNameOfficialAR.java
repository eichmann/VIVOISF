package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(EventNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventNameOfficialARIterator theEvent = (EventNameOfficialARIterator)findAncestorWithClass(this, EventNameOfficialARIterator.class);
			pageContext.getOut().print(theEvent.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

