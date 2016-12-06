package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentARG_2000028Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentARG_2000028Type currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentARG_2000028Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentARG_2000028Iterator theAgentARG_2000028Iterator = (AgentARG_2000028Iterator)findAncestorWithClass(this, AgentARG_2000028Iterator.class);
			pageContext.getOut().print(theAgentARG_2000028Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

