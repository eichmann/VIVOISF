package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceHDINotesIterator theConference = (ConferenceHDINotesIterator)findAncestorWithClass(this, ConferenceHDINotesIterator.class);
			pageContext.getOut().print(theConference.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

