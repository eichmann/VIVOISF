package edu.uiowa.slis.VIVOISF.Program;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProgramHasCollaborator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProgramHasCollaborator currentInstance = null;
	private static final Log log = LogFactory.getLog(ProgramHasCollaborator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProgramHasCollaboratorIterator theProgramHasCollaboratorIterator = (ProgramHasCollaboratorIterator)findAncestorWithClass(this, ProgramHasCollaboratorIterator.class);
			pageContext.getOut().print(theProgramHasCollaboratorIterator.getHasCollaborator());
		} catch (Exception e) {
			log.error("Can't find enclosing Program for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Program for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

