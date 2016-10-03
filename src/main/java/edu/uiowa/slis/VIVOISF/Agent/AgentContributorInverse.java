package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentContributorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentContributorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentContributorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentContributorInverseIterator theAgentContributorInverseIterator = (AgentContributorInverseIterator)findAncestorWithClass(this, AgentContributorInverseIterator.class);
			pageContext.getOut().print(theAgentContributorInverseIterator.getContributorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for contributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for contributor tag ");
		}
		return SKIP_BODY;
	}
}

