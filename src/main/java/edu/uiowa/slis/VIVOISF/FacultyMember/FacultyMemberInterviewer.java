package edu.uiowa.slis.VIVOISF.FacultyMember;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyMemberInterviewer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyMemberInterviewer currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyMemberInterviewer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyMemberInterviewerIterator theFacultyMemberInterviewerIterator = (FacultyMemberInterviewerIterator)findAncestorWithClass(this, FacultyMemberInterviewerIterator.class);
			pageContext.getOut().print(theFacultyMemberInterviewerIterator.getInterviewer());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyMember for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMember for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

