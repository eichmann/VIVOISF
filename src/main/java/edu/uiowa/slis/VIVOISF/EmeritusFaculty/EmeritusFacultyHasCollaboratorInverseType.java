package edu.uiowa.slis.VIVOISF.EmeritusFaculty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusFacultyHasCollaboratorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusFacultyHasCollaboratorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusFacultyHasCollaboratorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusFacultyHasCollaboratorInverseIterator theEmeritusFacultyHasCollaboratorInverseIterator = (EmeritusFacultyHasCollaboratorInverseIterator)findAncestorWithClass(this, EmeritusFacultyHasCollaboratorInverseIterator.class);
			pageContext.getOut().print(theEmeritusFacultyHasCollaboratorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusFaculty for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusFaculty for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

