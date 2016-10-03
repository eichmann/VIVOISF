package edu.uiowa.slis.VIVOISF.Student;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentInterviewerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentInterviewerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentInterviewerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentInterviewerInverseIterator theStudentInterviewerInverseIterator = (StudentInterviewerInverseIterator)findAncestorWithClass(this, StudentInterviewerInverseIterator.class);
			pageContext.getOut().print(theStudentInterviewerInverseIterator.getInterviewerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Student for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Student for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

