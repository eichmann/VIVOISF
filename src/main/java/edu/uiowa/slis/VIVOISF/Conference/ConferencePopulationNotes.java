package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePopulationNotesIterator theConference = (ConferencePopulationNotesIterator)findAncestorWithClass(this, ConferencePopulationNotesIterator.class);
			pageContext.getOut().print(theConference.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}

