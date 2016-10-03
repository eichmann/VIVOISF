package edu.uiowa.slis.VIVOISF.GraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GraduateStudentIntervieweeInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GraduateStudentIntervieweeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(GraduateStudentIntervieweeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GraduateStudentIntervieweeInverseIterator theGraduateStudentIntervieweeInverseIterator = (GraduateStudentIntervieweeInverseIterator)findAncestorWithClass(this, GraduateStudentIntervieweeInverseIterator.class);
			pageContext.getOut().print(theGraduateStudentIntervieweeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateStudent for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

