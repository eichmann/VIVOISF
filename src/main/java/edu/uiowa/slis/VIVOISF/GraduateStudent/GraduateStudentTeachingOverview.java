package edu.uiowa.slis.VIVOISF.GraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GraduateStudentTeachingOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GraduateStudentTeachingOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(GraduateStudentTeachingOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			GraduateStudent theGraduateStudent = (GraduateStudent)findAncestorWithClass(this, GraduateStudent.class);
			if (!theGraduateStudent.commitNeeded) {
				pageContext.getOut().print(theGraduateStudent.getTeachingOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateStudent for teachingOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for teachingOverview tag ");
		}
		return SKIP_BODY;
	}

	public String getTeachingOverview() throws JspTagException {
		try {
			GraduateStudent theGraduateStudent = (GraduateStudent)findAncestorWithClass(this, GraduateStudent.class);
			return theGraduateStudent.getTeachingOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing GraduateStudent for teachingOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for teachingOverview tag ");
		}
	}

	public void setTeachingOverview(String teachingOverview) throws JspTagException {
		try {
			GraduateStudent theGraduateStudent = (GraduateStudent)findAncestorWithClass(this, GraduateStudent.class);
			theGraduateStudent.setTeachingOverview(teachingOverview);
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateStudent for teachingOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for teachingOverview tag ");
		}
	}
}

