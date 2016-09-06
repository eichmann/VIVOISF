package edu.uiowa.slis.VIVOISF.UndergraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UndergraduateStudentHasCollaboratorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UndergraduateStudentHasCollaboratorType currentInstance = null;
	private static final Log log = LogFactory.getLog(UndergraduateStudentHasCollaboratorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UndergraduateStudentHasCollaboratorIterator theUndergraduateStudentHasCollaboratorIterator = (UndergraduateStudentHasCollaboratorIterator)findAncestorWithClass(this, UndergraduateStudentHasCollaboratorIterator.class);
			pageContext.getOut().print(theUndergraduateStudentHasCollaboratorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateStudent for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

