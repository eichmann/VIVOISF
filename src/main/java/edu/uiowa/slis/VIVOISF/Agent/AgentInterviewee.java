package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentInterviewee extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentInterviewee currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentInterviewee.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentIntervieweeIterator theAgentIntervieweeIterator = (AgentIntervieweeIterator)findAncestorWithClass(this, AgentIntervieweeIterator.class);
			pageContext.getOut().print(theAgentIntervieweeIterator.getInterviewee());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

