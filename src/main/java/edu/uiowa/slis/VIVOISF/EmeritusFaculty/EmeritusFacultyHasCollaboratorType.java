package edu.uiowa.slis.VIVOISF.EmeritusFaculty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusFacultyHasCollaboratorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusFacultyHasCollaboratorType currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusFacultyHasCollaboratorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusFacultyHasCollaboratorIterator theEmeritusFacultyHasCollaboratorIterator = (EmeritusFacultyHasCollaboratorIterator)findAncestorWithClass(this, EmeritusFacultyHasCollaboratorIterator.class);
			pageContext.getOut().print(theEmeritusFacultyHasCollaboratorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusFaculty for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusFaculty for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

