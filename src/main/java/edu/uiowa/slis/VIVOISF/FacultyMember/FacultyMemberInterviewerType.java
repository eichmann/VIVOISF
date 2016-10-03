package edu.uiowa.slis.VIVOISF.FacultyMember;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyMemberInterviewerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyMemberInterviewerType currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyMemberInterviewerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyMemberInterviewerIterator theFacultyMemberInterviewerIterator = (FacultyMemberInterviewerIterator)findAncestorWithClass(this, FacultyMemberInterviewerIterator.class);
			pageContext.getOut().print(theFacultyMemberInterviewerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyMember for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMember for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

