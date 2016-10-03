package edu.uiowa.slis.VIVOISF.Team;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TeamOrganizerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TeamOrganizerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(TeamOrganizerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TeamOrganizerInverseIterator theTeamOrganizerInverseIterator = (TeamOrganizerInverseIterator)findAncestorWithClass(this, TeamOrganizerInverseIterator.class);
			pageContext.getOut().print(theTeamOrganizerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Team for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Team for organizer tag ");
		}
		return SKIP_BODY;
	}
}

