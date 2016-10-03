package edu.uiowa.slis.VIVOISF.FacultyMember;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyMemberOrganizerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyMemberOrganizerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyMemberOrganizerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyMemberOrganizerInverseIterator theFacultyMemberOrganizerInverseIterator = (FacultyMemberOrganizerInverseIterator)findAncestorWithClass(this, FacultyMemberOrganizerInverseIterator.class);
			pageContext.getOut().print(theFacultyMemberOrganizerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyMember for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMember for organizer tag ");
		}
		return SKIP_BODY;
	}
}

