package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentPerformerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentPerformerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentPerformerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentPerformerInverseIterator theAgentPerformerInverseIterator = (AgentPerformerInverseIterator)findAncestorWithClass(this, AgentPerformerInverseIterator.class);
			pageContext.getOut().print(theAgentPerformerInverseIterator.getPerformerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for performer tag ");
		}
		return SKIP_BODY;
	}
}

