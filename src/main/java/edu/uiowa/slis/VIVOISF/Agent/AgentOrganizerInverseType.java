package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentOrganizerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentOrganizerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentOrganizerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentOrganizerInverseIterator theAgentOrganizerInverseIterator = (AgentOrganizerInverseIterator)findAncestorWithClass(this, AgentOrganizerInverseIterator.class);
			pageContext.getOut().print(theAgentOrganizerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for organizer tag ");
		}
		return SKIP_BODY;
	}
}

