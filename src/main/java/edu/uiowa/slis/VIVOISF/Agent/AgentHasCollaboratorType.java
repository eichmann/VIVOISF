package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentHasCollaboratorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentHasCollaboratorType currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentHasCollaboratorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentHasCollaboratorIterator theAgentHasCollaboratorIterator = (AgentHasCollaboratorIterator)findAncestorWithClass(this, AgentHasCollaboratorIterator.class);
			pageContext.getOut().print(theAgentHasCollaboratorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

