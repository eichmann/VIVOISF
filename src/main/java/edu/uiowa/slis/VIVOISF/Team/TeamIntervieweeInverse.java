package edu.uiowa.slis.VIVOISF.Team;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TeamIntervieweeInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TeamIntervieweeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(TeamIntervieweeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TeamIntervieweeInverseIterator theTeamIntervieweeInverseIterator = (TeamIntervieweeInverseIterator)findAncestorWithClass(this, TeamIntervieweeInverseIterator.class);
			pageContext.getOut().print(theTeamIntervieweeInverseIterator.getIntervieweeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Team for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Team for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

