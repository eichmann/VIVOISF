package edu.uiowa.slis.VIVOISF.Student;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentInterviewerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentInterviewerType currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentInterviewerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentInterviewerIterator theStudentInterviewerIterator = (StudentInterviewerIterator)findAncestorWithClass(this, StudentInterviewerIterator.class);
			pageContext.getOut().print(theStudentInterviewerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Student for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Student for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

