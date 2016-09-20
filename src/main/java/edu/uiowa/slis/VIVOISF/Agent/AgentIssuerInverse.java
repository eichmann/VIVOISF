package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentIssuerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentIssuerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentIssuerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentIssuerInverseIterator theAgentIssuerInverseIterator = (AgentIssuerInverseIterator)findAncestorWithClass(this, AgentIssuerInverseIterator.class);
			pageContext.getOut().print(theAgentIssuerInverseIterator.getIssuerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for issuer tag ");
		}
		return SKIP_BODY;
	}
}

