package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupHasCollaboratorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupHasCollaboratorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupHasCollaboratorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GroupHasCollaboratorInverseIterator theGroupHasCollaboratorInverseIterator = (GroupHasCollaboratorInverseIterator)findAncestorWithClass(this, GroupHasCollaboratorInverseIterator.class);
			pageContext.getOut().print(theGroupHasCollaboratorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

