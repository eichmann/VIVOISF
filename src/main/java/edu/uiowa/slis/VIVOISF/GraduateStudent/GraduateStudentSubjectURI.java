package edu.uiowa.slis.VIVOISF.GraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GraduateStudentSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GraduateStudentSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(GraduateStudentSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			GraduateStudent theGraduateStudent = (GraduateStudent)findAncestorWithClass(this, GraduateStudent.class);
			if (!theGraduateStudent.commitNeeded) {
				pageContext.getOut().print(theGraduateStudent.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateStudent for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			GraduateStudent theGraduateStudent = (GraduateStudent)findAncestorWithClass(this, GraduateStudent.class);
			return theGraduateStudent.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing GraduateStudent for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			GraduateStudent theGraduateStudent = (GraduateStudent)findAncestorWithClass(this, GraduateStudent.class);
			theGraduateStudent.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateStudent for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for subjectURI tag ");
		}
	}
}

