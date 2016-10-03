package edu.uiowa.slis.VIVOISF.Student;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentIntervieweeInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentIntervieweeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentIntervieweeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentIntervieweeInverseIterator theStudentIntervieweeInverseIterator = (StudentIntervieweeInverseIterator)findAncestorWithClass(this, StudentIntervieweeInverseIterator.class);
			pageContext.getOut().print(theStudentIntervieweeInverseIterator.getIntervieweeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Student for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Student for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

