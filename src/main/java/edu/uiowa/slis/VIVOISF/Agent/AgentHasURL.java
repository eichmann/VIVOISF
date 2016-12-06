package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentHasURL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentHasURL currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentHasURL.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentHasURLIterator theAgentHasURLIterator = (AgentHasURLIterator)findAncestorWithClass(this, AgentHasURLIterator.class);
			pageContext.getOut().print(theAgentHasURLIterator.getHasURL());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

