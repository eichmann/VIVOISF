package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentCodeAGROVOCIterator theAgent = (AgentCodeAGROVOCIterator)findAncestorWithClass(this, AgentCodeAGROVOCIterator.class);
			pageContext.getOut().print(theAgent.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}

