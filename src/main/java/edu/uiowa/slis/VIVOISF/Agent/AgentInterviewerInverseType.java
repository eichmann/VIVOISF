package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentInterviewerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentInterviewerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentInterviewerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentInterviewerInverseIterator theAgentInterviewerInverseIterator = (AgentInterviewerInverseIterator)findAncestorWithClass(this, AgentInterviewerInverseIterator.class);
			pageContext.getOut().print(theAgentInterviewerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

