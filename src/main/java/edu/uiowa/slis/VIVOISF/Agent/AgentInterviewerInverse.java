package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentInterviewerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentInterviewerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentInterviewerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentInterviewerInverseIterator theAgentInterviewerInverseIterator = (AgentInterviewerInverseIterator)findAncestorWithClass(this, AgentInterviewerInverseIterator.class);
			pageContext.getOut().print(theAgentInterviewerInverseIterator.getInterviewerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

