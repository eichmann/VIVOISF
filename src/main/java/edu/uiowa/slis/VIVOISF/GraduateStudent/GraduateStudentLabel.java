package edu.uiowa.slis.VIVOISF.GraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GraduateStudentLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GraduateStudentLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(GraduateStudentLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			GraduateStudent theGraduateStudent = (GraduateStudent)findAncestorWithClass(this, GraduateStudent.class);
			if (!theGraduateStudent.commitNeeded) {
				pageContext.getOut().print(theGraduateStudent.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateStudent for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			GraduateStudent theGraduateStudent = (GraduateStudent)findAncestorWithClass(this, GraduateStudent.class);
			return theGraduateStudent.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing GraduateStudent for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			GraduateStudent theGraduateStudent = (GraduateStudent)findAncestorWithClass(this, GraduateStudent.class);
			theGraduateStudent.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateStudent for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for label tag ");
		}
	}
}

