package edu.uiowa.slis.VIVOISF.Team;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TeamHasCollaborator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TeamHasCollaborator currentInstance = null;
	private static final Log log = LogFactory.getLog(TeamHasCollaborator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TeamHasCollaboratorIterator theTeamHasCollaboratorIterator = (TeamHasCollaboratorIterator)findAncestorWithClass(this, TeamHasCollaboratorIterator.class);
			pageContext.getOut().print(theTeamHasCollaboratorIterator.getHasCollaborator());
		} catch (Exception e) {
			log.error("Can't find enclosing Team for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Team for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

