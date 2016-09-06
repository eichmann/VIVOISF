package edu.uiowa.slis.VIVOISF.Student;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Student theStudent = (Student)findAncestorWithClass(this, Student.class);
			if (!theStudent.commitNeeded) {
				pageContext.getOut().print(theStudent.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Student for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Student for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Student theStudent = (Student)findAncestorWithClass(this, Student.class);
			return theStudent.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Student for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Student for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Student theStudent = (Student)findAncestorWithClass(this, Student.class);
			theStudent.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Student for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Student for label tag ");
		}
	}
}

