package edu.uiowa.slis.VIVOISF.Team;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TeamInterviewee extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TeamInterviewee currentInstance = null;
	private static final Log log = LogFactory.getLog(TeamInterviewee.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TeamIntervieweeIterator theTeamIntervieweeIterator = (TeamIntervieweeIterator)findAncestorWithClass(this, TeamIntervieweeIterator.class);
			pageContext.getOut().print(theTeamIntervieweeIterator.getInterviewee());
		} catch (Exception e) {
			log.error("Can't find enclosing Team for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Team for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

