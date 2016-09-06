package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentAssigneeFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentAssigneeFor currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentAssigneeFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentAssigneeForIterator theAgentAssigneeForIterator = (AgentAssigneeForIterator)findAncestorWithClass(this, AgentAssigneeForIterator.class);
			pageContext.getOut().print(theAgentAssigneeForIterator.getAssigneeFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for assigneeFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for assigneeFor tag ");
		}
		return SKIP_BODY;
	}
}

