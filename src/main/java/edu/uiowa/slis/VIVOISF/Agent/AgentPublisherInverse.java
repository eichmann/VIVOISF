package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentPublisherInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentPublisherInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentPublisherInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentPublisherInverseIterator theAgentPublisherInverseIterator = (AgentPublisherInverseIterator)findAncestorWithClass(this, AgentPublisherInverseIterator.class);
			pageContext.getOut().print(theAgentPublisherInverseIterator.getPublisherInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for publisher tag ");
		}
		return SKIP_BODY;
	}
}

