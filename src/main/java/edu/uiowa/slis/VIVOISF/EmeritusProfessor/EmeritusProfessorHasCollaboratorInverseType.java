package edu.uiowa.slis.VIVOISF.EmeritusProfessor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusProfessorHasCollaboratorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusProfessorHasCollaboratorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusProfessorHasCollaboratorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusProfessorHasCollaboratorInverseIterator theEmeritusProfessorHasCollaboratorInverseIterator = (EmeritusProfessorHasCollaboratorInverseIterator)findAncestorWithClass(this, EmeritusProfessorHasCollaboratorInverseIterator.class);
			pageContext.getOut().print(theEmeritusProfessorHasCollaboratorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusProfessor for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

