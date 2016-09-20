package edu.uiowa.slis.VIVOISF.Team;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TeamHasCollaboratorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TeamHasCollaboratorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(TeamHasCollaboratorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TeamHasCollaboratorInverseIterator theTeamHasCollaboratorInverseIterator = (TeamHasCollaboratorInverseIterator)findAncestorWithClass(this, TeamHasCollaboratorInverseIterator.class);
			pageContext.getOut().print(theTeamHasCollaboratorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Team for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Team for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

