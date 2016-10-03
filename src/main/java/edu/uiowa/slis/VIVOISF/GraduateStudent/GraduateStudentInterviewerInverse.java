package edu.uiowa.slis.VIVOISF.GraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GraduateStudentInterviewerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GraduateStudentInterviewerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(GraduateStudentInterviewerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GraduateStudentInterviewerInverseIterator theGraduateStudentInterviewerInverseIterator = (GraduateStudentInterviewerInverseIterator)findAncestorWithClass(this, GraduateStudentInterviewerInverseIterator.class);
			pageContext.getOut().print(theGraduateStudentInterviewerInverseIterator.getInterviewerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateStudent for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

