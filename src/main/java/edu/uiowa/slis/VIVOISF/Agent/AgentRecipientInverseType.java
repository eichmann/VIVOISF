package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentRecipientInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentRecipientInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentRecipientInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentRecipientInverseIterator theAgentRecipientInverseIterator = (AgentRecipientInverseIterator)findAncestorWithClass(this, AgentRecipientInverseIterator.class);
			pageContext.getOut().print(theAgentRecipientInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for recipient tag ");
		}
		return SKIP_BODY;
	}
}

