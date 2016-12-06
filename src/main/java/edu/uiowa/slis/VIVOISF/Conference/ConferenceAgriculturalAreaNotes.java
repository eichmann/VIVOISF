package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceAgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceAgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceAgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceAgriculturalAreaNotesIterator theConference = (ConferenceAgriculturalAreaNotesIterator)findAncestorWithClass(this, ConferenceAgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(theConference.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

