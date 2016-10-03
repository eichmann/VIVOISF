package edu.uiowa.slis.VIVOISF.Team;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TeamInterviewerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TeamInterviewerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(TeamInterviewerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TeamInterviewerInverseIterator theTeamInterviewerInverseIterator = (TeamInterviewerInverseIterator)findAncestorWithClass(this, TeamInterviewerInverseIterator.class);
			pageContext.getOut().print(theTeamInterviewerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Team for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Team for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

