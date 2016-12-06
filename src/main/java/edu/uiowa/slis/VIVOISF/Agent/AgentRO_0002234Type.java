package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentRO_0002234Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentRO_0002234Type currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentRO_0002234Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentRO_0002234Iterator theAgentRO_0002234Iterator = (AgentRO_0002234Iterator)findAncestorWithClass(this, AgentRO_0002234Iterator.class);
			pageContext.getOut().print(theAgentRO_0002234Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for RO_0002234 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for RO_0002234 tag ");
		}
		return SKIP_BODY;
	}
}
