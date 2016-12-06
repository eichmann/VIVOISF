package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceGDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceGDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceGDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceGDPNotesIterator theConference = (ConferenceGDPNotesIterator)findAncestorWithClass(this, ConferenceGDPNotesIterator.class);
			pageContext.getOut().print(theConference.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}

