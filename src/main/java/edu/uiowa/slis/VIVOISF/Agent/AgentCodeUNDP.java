package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentCodeUNDPIterator theAgent = (AgentCodeUNDPIterator)findAncestorWithClass(this, AgentCodeUNDPIterator.class);
			pageContext.getOut().print(theAgent.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}
