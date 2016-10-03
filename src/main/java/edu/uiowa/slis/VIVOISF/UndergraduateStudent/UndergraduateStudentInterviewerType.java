package edu.uiowa.slis.VIVOISF.UndergraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UndergraduateStudentInterviewerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UndergraduateStudentInterviewerType currentInstance = null;
	private static final Log log = LogFactory.getLog(UndergraduateStudentInterviewerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UndergraduateStudentInterviewerIterator theUndergraduateStudentInterviewerIterator = (UndergraduateStudentInterviewerIterator)findAncestorWithClass(this, UndergraduateStudentInterviewerIterator.class);
			pageContext.getOut().print(theUndergraduateStudentInterviewerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateStudent for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

