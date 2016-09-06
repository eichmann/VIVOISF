package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupHasCollaboratorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupHasCollaboratorType currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupHasCollaboratorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GroupHasCollaboratorIterator theGroupHasCollaboratorIterator = (GroupHasCollaboratorIterator)findAncestorWithClass(this, GroupHasCollaboratorIterator.class);
			pageContext.getOut().print(theGroupHasCollaboratorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

