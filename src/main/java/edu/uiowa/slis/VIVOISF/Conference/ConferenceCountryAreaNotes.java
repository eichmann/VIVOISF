package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceCountryAreaNotesIterator theConference = (ConferenceCountryAreaNotesIterator)findAncestorWithClass(this, ConferenceCountryAreaNotesIterator.class);
			pageContext.getOut().print(theConference.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

