package edu.uiowa.slis.VIVOISF.FacultyMember;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyMemberInterviewerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyMemberInterviewerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyMemberInterviewerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyMemberInterviewerInverseIterator theFacultyMemberInterviewerInverseIterator = (FacultyMemberInterviewerInverseIterator)findAncestorWithClass(this, FacultyMemberInterviewerInverseIterator.class);
			pageContext.getOut().print(theFacultyMemberInterviewerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyMember for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMember for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

