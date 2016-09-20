package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentHasCollaboratorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentHasCollaboratorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentHasCollaboratorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentHasCollaboratorInverseIterator theAgentHasCollaboratorInverseIterator = (AgentHasCollaboratorInverseIterator)findAncestorWithClass(this, AgentHasCollaboratorInverseIterator.class);
			pageContext.getOut().print(theAgentHasCollaboratorInverseIterator.getHasCollaboratorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

