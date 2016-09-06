package edu.uiowa.slis.VIVOISF.GraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GraduateStudentHasCollaborator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GraduateStudentHasCollaborator currentInstance = null;
	private static final Log log = LogFactory.getLog(GraduateStudentHasCollaborator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GraduateStudentHasCollaboratorIterator theGraduateStudentHasCollaboratorIterator = (GraduateStudentHasCollaboratorIterator)findAncestorWithClass(this, GraduateStudentHasCollaboratorIterator.class);
			pageContext.getOut().print(theGraduateStudentHasCollaboratorIterator.getHasCollaborator());
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateStudent for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

