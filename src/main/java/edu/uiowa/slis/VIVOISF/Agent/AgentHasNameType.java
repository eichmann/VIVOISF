package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentHasNameType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentHasNameType currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentHasNameType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentHasNameIterator theAgentHasNameIterator = (AgentHasNameIterator)findAncestorWithClass(this, AgentHasNameIterator.class);
			pageContext.getOut().print(theAgentHasNameIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for hasName tag ");
		}
		return SKIP_BODY;
	}
}

