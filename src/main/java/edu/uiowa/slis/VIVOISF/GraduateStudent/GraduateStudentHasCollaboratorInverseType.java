package edu.uiowa.slis.VIVOISF.GraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GraduateStudentHasCollaboratorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GraduateStudentHasCollaboratorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(GraduateStudentHasCollaboratorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GraduateStudentHasCollaboratorInverseIterator theGraduateStudentHasCollaboratorInverseIterator = (GraduateStudentHasCollaboratorInverseIterator)findAncestorWithClass(this, GraduateStudentHasCollaboratorInverseIterator.class);
			pageContext.getOut().print(theGraduateStudentHasCollaboratorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateStudent for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

