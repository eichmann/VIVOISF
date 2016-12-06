package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentPublisher extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentPublisher currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentPublisher.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentPublisherIterator theAgentPublisherIterator = (AgentPublisherIterator)findAncestorWithClass(this, AgentPublisherIterator.class);
			pageContext.getOut().print(theAgentPublisherIterator.getPublisher());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for publisher tag ");
		}
		return SKIP_BODY;
	}
}

