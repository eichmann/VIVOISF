package edu.uiowa.slis.VIVOISF.Program;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProgramHasCollaboratorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProgramHasCollaboratorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ProgramHasCollaboratorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProgramHasCollaboratorInverseIterator theProgramHasCollaboratorInverseIterator = (ProgramHasCollaboratorInverseIterator)findAncestorWithClass(this, ProgramHasCollaboratorInverseIterator.class);
			pageContext.getOut().print(theProgramHasCollaboratorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Program for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Program for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

