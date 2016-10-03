package edu.uiowa.slis.VIVOISF.UndergraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UndergraduateStudentIntervieweeType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UndergraduateStudentIntervieweeType currentInstance = null;
	private static final Log log = LogFactory.getLog(UndergraduateStudentIntervieweeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UndergraduateStudentIntervieweeIterator theUndergraduateStudentIntervieweeIterator = (UndergraduateStudentIntervieweeIterator)findAncestorWithClass(this, UndergraduateStudentIntervieweeIterator.class);
			pageContext.getOut().print(theUndergraduateStudentIntervieweeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateStudent for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

