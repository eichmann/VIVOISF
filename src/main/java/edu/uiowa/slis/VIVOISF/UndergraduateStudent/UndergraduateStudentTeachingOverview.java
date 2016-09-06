package edu.uiowa.slis.VIVOISF.UndergraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UndergraduateStudentTeachingOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UndergraduateStudentTeachingOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(UndergraduateStudentTeachingOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			UndergraduateStudent theUndergraduateStudent = (UndergraduateStudent)findAncestorWithClass(this, UndergraduateStudent.class);
			if (!theUndergraduateStudent.commitNeeded) {
				pageContext.getOut().print(theUndergraduateStudent.getTeachingOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateStudent for teachingOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for teachingOverview tag ");
		}
		return SKIP_BODY;
	}

	public String getTeachingOverview() throws JspTagException {
		try {
			UndergraduateStudent theUndergraduateStudent = (UndergraduateStudent)findAncestorWithClass(this, UndergraduateStudent.class);
			return theUndergraduateStudent.getTeachingOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing UndergraduateStudent for teachingOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for teachingOverview tag ");
		}
	}

	public void setTeachingOverview(String teachingOverview) throws JspTagException {
		try {
			UndergraduateStudent theUndergraduateStudent = (UndergraduateStudent)findAncestorWithClass(this, UndergraduateStudent.class);
			theUndergraduateStudent.setTeachingOverview(teachingOverview);
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateStudent for teachingOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for teachingOverview tag ");
		}
	}
}

