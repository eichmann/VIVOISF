package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentRelatedByIterator theAgentRelatedByIterator = (AgentRelatedByIterator)findAncestorWithClass(this, AgentRelatedByIterator.class);
			pageContext.getOut().print(theAgentRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

