package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentDirectorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentDirectorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentDirectorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentDirectorInverseIterator theAgentDirectorInverseIterator = (AgentDirectorInverseIterator)findAncestorWithClass(this, AgentDirectorInverseIterator.class);
			pageContext.getOut().print(theAgentDirectorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for director tag ");
		}
		return SKIP_BODY;
	}
}

