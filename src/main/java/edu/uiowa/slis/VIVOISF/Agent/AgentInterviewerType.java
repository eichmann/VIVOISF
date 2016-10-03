package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentInterviewerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentInterviewerType currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentInterviewerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentInterviewerIterator theAgentInterviewerIterator = (AgentInterviewerIterator)findAncestorWithClass(this, AgentInterviewerIterator.class);
			pageContext.getOut().print(theAgentInterviewerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

