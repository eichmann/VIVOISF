package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentRO_0000056Iterator theAgentRO_0000056Iterator = (AgentRO_0000056Iterator)findAncestorWithClass(this, AgentRO_0000056Iterator.class);
			pageContext.getOut().print(theAgentRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

