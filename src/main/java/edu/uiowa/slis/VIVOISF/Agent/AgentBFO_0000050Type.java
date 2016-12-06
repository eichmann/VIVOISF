package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentBFO_0000050Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentBFO_0000050Type currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentBFO_0000050Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentBFO_0000050Iterator theAgentBFO_0000050Iterator = (AgentBFO_0000050Iterator)findAncestorWithClass(this, AgentBFO_0000050Iterator.class);
			pageContext.getOut().print(theAgentBFO_0000050Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for BFO_0000050 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for BFO_0000050 tag ");
		}
		return SKIP_BODY;
	}
}

