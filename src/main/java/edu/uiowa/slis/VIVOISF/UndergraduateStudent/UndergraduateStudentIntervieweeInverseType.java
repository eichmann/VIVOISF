package edu.uiowa.slis.VIVOISF.UndergraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UndergraduateStudentIntervieweeInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UndergraduateStudentIntervieweeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(UndergraduateStudentIntervieweeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UndergraduateStudentIntervieweeInverseIterator theUndergraduateStudentIntervieweeInverseIterator = (UndergraduateStudentIntervieweeInverseIterator)findAncestorWithClass(this, UndergraduateStudentIntervieweeInverseIterator.class);
			pageContext.getOut().print(theUndergraduateStudentIntervieweeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateStudent for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for interviewee tag ");
		}
		return SKIP_BODY;
	}
}
