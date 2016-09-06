package edu.uiowa.slis.VIVOISF.FacultyMember;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyMemberHasCollaborator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyMemberHasCollaborator currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyMemberHasCollaborator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyMemberHasCollaboratorIterator theFacultyMemberHasCollaboratorIterator = (FacultyMemberHasCollaboratorIterator)findAncestorWithClass(this, FacultyMemberHasCollaboratorIterator.class);
			pageContext.getOut().print(theFacultyMemberHasCollaboratorIterator.getHasCollaborator());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyMember for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMember for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

