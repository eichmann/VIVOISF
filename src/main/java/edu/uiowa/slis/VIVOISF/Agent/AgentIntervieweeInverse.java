package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentIntervieweeInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentIntervieweeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentIntervieweeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentIntervieweeInverseIterator theAgentIntervieweeInverseIterator = (AgentIntervieweeInverseIterator)findAncestorWithClass(this, AgentIntervieweeInverseIterator.class);
			pageContext.getOut().print(theAgentIntervieweeInverseIterator.getIntervieweeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

