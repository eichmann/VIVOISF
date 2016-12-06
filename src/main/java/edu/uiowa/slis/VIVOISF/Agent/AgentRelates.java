package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentRelates extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentRelates currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentRelates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentRelatesIterator theAgentRelatesIterator = (AgentRelatesIterator)findAncestorWithClass(this, AgentRelatesIterator.class);
			pageContext.getOut().print(theAgentRelatesIterator.getRelates());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for relates tag ");
		}
		return SKIP_BODY;
	}
}

