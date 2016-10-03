package edu.uiowa.slis.VIVOISF.UndergraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UndergraduateStudentInterviewer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UndergraduateStudentInterviewer currentInstance = null;
	private static final Log log = LogFactory.getLog(UndergraduateStudentInterviewer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UndergraduateStudentInterviewerIterator theUndergraduateStudentInterviewerIterator = (UndergraduateStudentInterviewerIterator)findAncestorWithClass(this, UndergraduateStudentInterviewerIterator.class);
			pageContext.getOut().print(theUndergraduateStudentInterviewerIterator.getInterviewer());
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateStudent for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

