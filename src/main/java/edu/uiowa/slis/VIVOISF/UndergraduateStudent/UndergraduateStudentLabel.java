package edu.uiowa.slis.VIVOISF.UndergraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UndergraduateStudentLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UndergraduateStudentLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(UndergraduateStudentLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			UndergraduateStudent theUndergraduateStudent = (UndergraduateStudent)findAncestorWithClass(this, UndergraduateStudent.class);
			if (!theUndergraduateStudent.commitNeeded) {
				pageContext.getOut().print(theUndergraduateStudent.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateStudent for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			UndergraduateStudent theUndergraduateStudent = (UndergraduateStudent)findAncestorWithClass(this, UndergraduateStudent.class);
			return theUndergraduateStudent.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing UndergraduateStudent for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			UndergraduateStudent theUndergraduateStudent = (UndergraduateStudent)findAncestorWithClass(this, UndergraduateStudent.class);
			theUndergraduateStudent.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateStudent for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for label tag ");
		}
	}
}

