package edu.uiowa.slis.VIVOISF.UndergraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UndergraduateStudentHasCollaborator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UndergraduateStudentHasCollaborator currentInstance = null;
	private static final Log log = LogFactory.getLog(UndergraduateStudentHasCollaborator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UndergraduateStudentHasCollaboratorIterator theUndergraduateStudentHasCollaboratorIterator = (UndergraduateStudentHasCollaboratorIterator)findAncestorWithClass(this, UndergraduateStudentHasCollaboratorIterator.class);
			pageContext.getOut().print(theUndergraduateStudentHasCollaboratorIterator.getHasCollaborator());
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateStudent for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

