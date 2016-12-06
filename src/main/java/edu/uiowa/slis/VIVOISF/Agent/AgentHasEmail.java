package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentHasEmail extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentHasEmail currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentHasEmail.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentHasEmailIterator theAgentHasEmailIterator = (AgentHasEmailIterator)findAncestorWithClass(this, AgentHasEmailIterator.class);
			pageContext.getOut().print(theAgentHasEmailIterator.getHasEmail());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

