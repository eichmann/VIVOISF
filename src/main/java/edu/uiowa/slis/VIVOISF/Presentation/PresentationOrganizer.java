package edu.uiowa.slis.VIVOISF.Presentation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PresentationOrganizer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PresentationOrganizer currentInstance = null;
	private static final Log log = LogFactory.getLog(PresentationOrganizer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PresentationOrganizerIterator thePresentationOrganizerIterator = (PresentationOrganizerIterator)findAncestorWithClass(this, PresentationOrganizerIterator.class);
			pageContext.getOut().print(thePresentationOrganizerIterator.getOrganizer());
		} catch (Exception e) {
			log.error("Can't find enclosing Presentation for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Presentation for organizer tag ");
		}
		return SKIP_BODY;
	}
}

