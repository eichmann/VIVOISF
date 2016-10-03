package edu.uiowa.slis.VIVOISF.Interview;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InterviewOrganizer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InterviewOrganizer currentInstance = null;
	private static final Log log = LogFactory.getLog(InterviewOrganizer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InterviewOrganizerIterator theInterviewOrganizerIterator = (InterviewOrganizerIterator)findAncestorWithClass(this, InterviewOrganizerIterator.class);
			pageContext.getOut().print(theInterviewOrganizerIterator.getOrganizer());
		} catch (Exception e) {
			log.error("Can't find enclosing Interview for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Interview for organizer tag ");
		}
		return SKIP_BODY;
	}
}

