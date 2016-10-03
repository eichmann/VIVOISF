package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentPublisherInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentPublisherInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentPublisherInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentPublisherInverseIterator theAgentPublisherInverseIterator = (AgentPublisherInverseIterator)findAncestorWithClass(this, AgentPublisherInverseIterator.class);
			pageContext.getOut().print(theAgentPublisherInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for publisher tag ");
		}
		return SKIP_BODY;
	}
}

