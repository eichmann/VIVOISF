package edu.uiowa.slis.VIVOISF.Student;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentHasCollaborator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentHasCollaborator currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentHasCollaborator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentHasCollaboratorIterator theStudentHasCollaboratorIterator = (StudentHasCollaboratorIterator)findAncestorWithClass(this, StudentHasCollaboratorIterator.class);
			pageContext.getOut().print(theStudentHasCollaboratorIterator.getHasCollaborator());
		} catch (Exception e) {
			log.error("Can't find enclosing Student for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Student for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

