package edu.uiowa.slis.VIVOISF.Student;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Student theStudent = (Student)findAncestorWithClass(this, Student.class);
			if (!theStudent.commitNeeded) {
				pageContext.getOut().print(theStudent.getOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Student for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Student for overview tag ");
		}
		return SKIP_BODY;
	}

	public String getOverview() throws JspTagException {
		try {
			Student theStudent = (Student)findAncestorWithClass(this, Student.class);
			return theStudent.getOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing Student for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Student for overview tag ");
		}
	}

	public void setOverview(String overview) throws JspTagException {
		try {
			Student theStudent = (Student)findAncestorWithClass(this, Student.class);
			theStudent.setOverview(overview);
		} catch (Exception e) {
			log.error("Can't find enclosing Student for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Student for overview tag ");
		}
	}
}

