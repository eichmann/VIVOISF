package edu.uiowa.slis.VIVOISF.FacultyMember;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyMemberAssigneeFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyMemberAssigneeFor currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyMemberAssigneeFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyMemberAssigneeForIterator theFacultyMemberAssigneeForIterator = (FacultyMemberAssigneeForIterator)findAncestorWithClass(this, FacultyMemberAssigneeForIterator.class);
			pageContext.getOut().print(theFacultyMemberAssigneeForIterator.getAssigneeFor());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyMember for assigneeFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMember for assigneeFor tag ");
		}
		return SKIP_BODY;
	}
}

