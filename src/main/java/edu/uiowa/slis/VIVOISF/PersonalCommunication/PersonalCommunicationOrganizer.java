package edu.uiowa.slis.VIVOISF.PersonalCommunication;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationOrganizer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationOrganizer currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationOrganizer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationOrganizerIterator thePersonalCommunicationOrganizerIterator = (PersonalCommunicationOrganizerIterator)findAncestorWithClass(this, PersonalCommunicationOrganizerIterator.class);
			pageContext.getOut().print(thePersonalCommunicationOrganizerIterator.getOrganizer());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunication for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunication for organizer tag ");
		}
		return SKIP_BODY;
	}
}

