package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventAgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventAgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(EventAgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventAgriculturalAreaNotesIterator theEvent = (EventAgriculturalAreaNotesIterator)findAncestorWithClass(this, EventAgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(theEvent.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

