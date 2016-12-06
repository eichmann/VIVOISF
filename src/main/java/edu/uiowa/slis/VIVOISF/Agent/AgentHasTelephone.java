package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentHasTelephone extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentHasTelephone currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentHasTelephone.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentHasTelephoneIterator theAgentHasTelephoneIterator = (AgentHasTelephoneIterator)findAncestorWithClass(this, AgentHasTelephoneIterator.class);
			pageContext.getOut().print(theAgentHasTelephoneIterator.getHasTelephone());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

