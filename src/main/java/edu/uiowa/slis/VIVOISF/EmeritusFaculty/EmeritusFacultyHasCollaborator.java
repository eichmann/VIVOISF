package edu.uiowa.slis.VIVOISF.EmeritusFaculty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusFacultyHasCollaborator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusFacultyHasCollaborator currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusFacultyHasCollaborator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusFacultyHasCollaboratorIterator theEmeritusFacultyHasCollaboratorIterator = (EmeritusFacultyHasCollaboratorIterator)findAncestorWithClass(this, EmeritusFacultyHasCollaboratorIterator.class);
			pageContext.getOut().print(theEmeritusFacultyHasCollaboratorIterator.getHasCollaborator());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusFaculty for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusFaculty for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

