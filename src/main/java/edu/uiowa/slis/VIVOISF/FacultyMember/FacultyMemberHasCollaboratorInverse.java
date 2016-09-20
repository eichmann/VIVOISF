package edu.uiowa.slis.VIVOISF.FacultyMember;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyMemberHasCollaboratorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyMemberHasCollaboratorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyMemberHasCollaboratorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyMemberHasCollaboratorInverseIterator theFacultyMemberHasCollaboratorInverseIterator = (FacultyMemberHasCollaboratorInverseIterator)findAncestorWithClass(this, FacultyMemberHasCollaboratorInverseIterator.class);
			pageContext.getOut().print(theFacultyMemberHasCollaboratorInverseIterator.getHasCollaboratorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyMember for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMember for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

