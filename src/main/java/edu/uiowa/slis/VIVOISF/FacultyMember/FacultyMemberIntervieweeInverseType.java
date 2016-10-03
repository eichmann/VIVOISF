package edu.uiowa.slis.VIVOISF.FacultyMember;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyMemberIntervieweeInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyMemberIntervieweeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyMemberIntervieweeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyMemberIntervieweeInverseIterator theFacultyMemberIntervieweeInverseIterator = (FacultyMemberIntervieweeInverseIterator)findAncestorWithClass(this, FacultyMemberIntervieweeInverseIterator.class);
			pageContext.getOut().print(theFacultyMemberIntervieweeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyMember for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMember for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

