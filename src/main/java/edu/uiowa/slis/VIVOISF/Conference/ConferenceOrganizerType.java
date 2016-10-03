package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceOrganizerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceOrganizerType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceOrganizerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferenceOrganizerIterator theConferenceOrganizerIterator = (ConferenceOrganizerIterator)findAncestorWithClass(this, ConferenceOrganizerIterator.class);
			pageContext.getOut().print(theConferenceOrganizerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for organizer tag ");
		}
		return SKIP_BODY;
	}
}

