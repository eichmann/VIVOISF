package edu.uiowa.slis.VIVOISF.Student;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentTeachingOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentTeachingOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentTeachingOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Student theStudent = (Student)findAncestorWithClass(this, Student.class);
			if (!theStudent.commitNeeded) {
				pageContext.getOut().print(theStudent.getTeachingOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Student for teachingOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Student for teachingOverview tag ");
		}
		return SKIP_BODY;
	}

	public String getTeachingOverview() throws JspTagException {
		try {
			Student theStudent = (Student)findAncestorWithClass(this, Student.class);
			return theStudent.getTeachingOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing Student for teachingOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Student for teachingOverview tag ");
		}
	}

	public void setTeachingOverview(String teachingOverview) throws JspTagException {
		try {
			Student theStudent = (Student)findAncestorWithClass(this, Student.class);
			theStudent.setTeachingOverview(teachingOverview);
		} catch (Exception e) {
			log.error("Can't find enclosing Student for teachingOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Student for teachingOverview tag ");
		}
	}
}

