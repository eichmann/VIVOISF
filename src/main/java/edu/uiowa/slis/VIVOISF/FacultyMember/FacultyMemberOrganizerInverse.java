package edu.uiowa.slis.VIVOISF.FacultyMember;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyMemberOrganizerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyMemberOrganizerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyMemberOrganizerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyMemberOrganizerInverseIterator theFacultyMemberOrganizerInverseIterator = (FacultyMemberOrganizerInverseIterator)findAncestorWithClass(this, FacultyMemberOrganizerInverseIterator.class);
			pageContext.getOut().print(theFacultyMemberOrganizerInverseIterator.getOrganizerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyMember for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMember for organizer tag ");
		}
		return SKIP_BODY;
	}
}

