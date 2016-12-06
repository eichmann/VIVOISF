package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentHasResearchAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentHasResearchAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentHasResearchAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentHasResearchAreaIterator theAgentHasResearchAreaIterator = (AgentHasResearchAreaIterator)findAncestorWithClass(this, AgentHasResearchAreaIterator.class);
			pageContext.getOut().print(theAgentHasResearchAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

