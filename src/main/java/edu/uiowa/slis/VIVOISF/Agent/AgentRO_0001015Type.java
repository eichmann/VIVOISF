package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentRO_0001015Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentRO_0001015Type currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentRO_0001015Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentRO_0001015Iterator theAgentRO_0001015Iterator = (AgentRO_0001015Iterator)findAncestorWithClass(this, AgentRO_0001015Iterator.class);
			pageContext.getOut().print(theAgentRO_0001015Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for RO_0001015 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for RO_0001015 tag ");
		}
		return SKIP_BODY;
	}
}

