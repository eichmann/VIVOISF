package edu.uiowa.slis.VIVOISF.Student;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Student theStudent = (Student)findAncestorWithClass(this, Student.class);
			if (!theStudent.commitNeeded) {
				pageContext.getOut().print(theStudent.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Student for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Student for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Student theStudent = (Student)findAncestorWithClass(this, Student.class);
			return theStudent.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Student for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Student for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Student theStudent = (Student)findAncestorWithClass(this, Student.class);
			theStudent.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Student for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Student for subjectURI tag ");
		}
	}
}

