package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentOwnerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentOwnerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentOwnerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentOwnerInverseIterator theAgentOwnerInverseIterator = (AgentOwnerInverseIterator)findAncestorWithClass(this, AgentOwnerInverseIterator.class);
			pageContext.getOut().print(theAgentOwnerInverseIterator.getOwnerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for owner tag ");
		}
		return SKIP_BODY;
	}
}

