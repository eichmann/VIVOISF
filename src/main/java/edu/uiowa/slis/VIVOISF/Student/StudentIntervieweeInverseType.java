package edu.uiowa.slis.VIVOISF.Student;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentIntervieweeInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentIntervieweeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentIntervieweeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentIntervieweeInverseIterator theStudentIntervieweeInverseIterator = (StudentIntervieweeInverseIterator)findAncestorWithClass(this, StudentIntervieweeInverseIterator.class);
			pageContext.getOut().print(theStudentIntervieweeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Student for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Student for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

