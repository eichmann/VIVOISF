package edu.uiowa.slis.VIVOISF.Exhibit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExhibitOrganizer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExhibitOrganizer currentInstance = null;
	private static final Log log = LogFactory.getLog(ExhibitOrganizer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExhibitOrganizerIterator theExhibitOrganizerIterator = (ExhibitOrganizerIterator)findAncestorWithClass(this, ExhibitOrganizerIterator.class);
			pageContext.getOut().print(theExhibitOrganizerIterator.getOrganizer());
		} catch (Exception e) {
			log.error("Can't find enclosing Exhibit for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Exhibit for organizer tag ");
		}
		return SKIP_BODY;
	}
}

