package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentCodeFAOSTATIterator theAgent = (AgentCodeFAOSTATIterator)findAncestorWithClass(this, AgentCodeFAOSTATIterator.class);
			pageContext.getOut().print(theAgent.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}

