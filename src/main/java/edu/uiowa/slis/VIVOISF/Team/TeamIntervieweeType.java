package edu.uiowa.slis.VIVOISF.Team;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TeamIntervieweeType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TeamIntervieweeType currentInstance = null;
	private static final Log log = LogFactory.getLog(TeamIntervieweeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TeamIntervieweeIterator theTeamIntervieweeIterator = (TeamIntervieweeIterator)findAncestorWithClass(this, TeamIntervieweeIterator.class);
			pageContext.getOut().print(theTeamIntervieweeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Team for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Team for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

