package edu.uiowa.slis.VIVOISF.UndergraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UndergraduateStudentInterviewerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UndergraduateStudentInterviewerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(UndergraduateStudentInterviewerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UndergraduateStudentInterviewerInverseIterator theUndergraduateStudentInterviewerInverseIterator = (UndergraduateStudentInterviewerInverseIterator)findAncestorWithClass(this, UndergraduateStudentInterviewerInverseIterator.class);
			pageContext.getOut().print(theUndergraduateStudentInterviewerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateStudent for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

