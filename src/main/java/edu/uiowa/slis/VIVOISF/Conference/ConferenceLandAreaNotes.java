package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceLandAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceLandAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceLandAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceLandAreaNotesIterator theConference = (ConferenceLandAreaNotesIterator)findAncestorWithClass(this, ConferenceLandAreaNotesIterator.class);
			pageContext.getOut().print(theConference.getLandAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for landAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for landAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

