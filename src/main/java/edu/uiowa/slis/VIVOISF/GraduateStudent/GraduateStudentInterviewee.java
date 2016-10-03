package edu.uiowa.slis.VIVOISF.GraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GraduateStudentInterviewee extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GraduateStudentInterviewee currentInstance = null;
	private static final Log log = LogFactory.getLog(GraduateStudentInterviewee.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GraduateStudentIntervieweeIterator theGraduateStudentIntervieweeIterator = (GraduateStudentIntervieweeIterator)findAncestorWithClass(this, GraduateStudentIntervieweeIterator.class);
			pageContext.getOut().print(theGraduateStudentIntervieweeIterator.getInterviewee());
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateStudent for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

