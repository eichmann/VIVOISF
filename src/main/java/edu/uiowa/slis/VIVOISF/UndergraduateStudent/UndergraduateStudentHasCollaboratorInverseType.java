package edu.uiowa.slis.VIVOISF.UndergraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UndergraduateStudentHasCollaboratorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UndergraduateStudentHasCollaboratorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(UndergraduateStudentHasCollaboratorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UndergraduateStudentHasCollaboratorInverseIterator theUndergraduateStudentHasCollaboratorInverseIterator = (UndergraduateStudentHasCollaboratorInverseIterator)findAncestorWithClass(this, UndergraduateStudentHasCollaboratorInverseIterator.class);
			pageContext.getOut().print(theUndergraduateStudentHasCollaboratorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateStudent for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

