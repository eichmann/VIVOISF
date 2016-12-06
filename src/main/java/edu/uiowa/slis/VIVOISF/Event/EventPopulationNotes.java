package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventPopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventPopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(EventPopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventPopulationNotesIterator theEvent = (EventPopulationNotesIterator)findAncestorWithClass(this, EventPopulationNotesIterator.class);
			pageContext.getOut().print(theEvent.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}

