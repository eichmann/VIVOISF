package edu.uiowa.slis.VIVOISF.Team;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TeamInterviewer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TeamInterviewer currentInstance = null;
	private static final Log log = LogFactory.getLog(TeamInterviewer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TeamInterviewerIterator theTeamInterviewerIterator = (TeamInterviewerIterator)findAncestorWithClass(this, TeamInterviewerIterator.class);
			pageContext.getOut().print(theTeamInterviewerIterator.getInterviewer());
		} catch (Exception e) {
			log.error("Can't find enclosing Team for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Team for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

