package edu.uiowa.slis.VIVOISF.EmeritusProfessor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusProfessorHasCollaboratorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusProfessorHasCollaboratorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusProfessorHasCollaboratorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusProfessorHasCollaboratorInverseIterator theEmeritusProfessorHasCollaboratorInverseIterator = (EmeritusProfessorHasCollaboratorInverseIterator)findAncestorWithClass(this, EmeritusProfessorHasCollaboratorInverseIterator.class);
			pageContext.getOut().print(theEmeritusProfessorHasCollaboratorInverseIterator.getHasCollaboratorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusProfessor for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

