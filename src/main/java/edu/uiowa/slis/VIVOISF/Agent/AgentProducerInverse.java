package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentProducerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentProducerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentProducerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentProducerInverseIterator theAgentProducerInverseIterator = (AgentProducerInverseIterator)findAncestorWithClass(this, AgentProducerInverseIterator.class);
			pageContext.getOut().print(theAgentProducerInverseIterator.getProducerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for producer tag ");
		}
		return SKIP_BODY;
	}
}

