package edu.uiowa.slis.VIVOISF.UndergraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UndergraduateStudentSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UndergraduateStudentSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(UndergraduateStudentSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			UndergraduateStudent theUndergraduateStudent = (UndergraduateStudent)findAncestorWithClass(this, UndergraduateStudent.class);
			if (!theUndergraduateStudent.commitNeeded) {
				pageContext.getOut().print(theUndergraduateStudent.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateStudent for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			UndergraduateStudent theUndergraduateStudent = (UndergraduateStudent)findAncestorWithClass(this, UndergraduateStudent.class);
			return theUndergraduateStudent.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing UndergraduateStudent for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			UndergraduateStudent theUndergraduateStudent = (UndergraduateStudent)findAncestorWithClass(this, UndergraduateStudent.class);
			theUndergraduateStudent.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateStudent for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for subjectURI tag ");
		}
	}
}

