package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentHasAddress extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentHasAddress currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentHasAddress.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentHasAddressIterator theAgentHasAddressIterator = (AgentHasAddressIterator)findAncestorWithClass(this, AgentHasAddressIterator.class);
			pageContext.getOut().print(theAgentHasAddressIterator.getHasAddress());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

