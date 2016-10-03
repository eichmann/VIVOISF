package edu.uiowa.slis.VIVOISF.Team;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TeamInterviewerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TeamInterviewerType currentInstance = null;
	private static final Log log = LogFactory.getLog(TeamInterviewerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TeamInterviewerIterator theTeamInterviewerIterator = (TeamInterviewerIterator)findAncestorWithClass(this, TeamInterviewerIterator.class);
			pageContext.getOut().print(theTeamInterviewerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Team for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Team for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

