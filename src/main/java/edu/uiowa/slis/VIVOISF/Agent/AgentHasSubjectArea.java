package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentHasSubjectArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentHasSubjectArea currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentHasSubjectArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentHasSubjectAreaIterator theAgentHasSubjectAreaIterator = (AgentHasSubjectAreaIterator)findAncestorWithClass(this, AgentHasSubjectAreaIterator.class);
			pageContext.getOut().print(theAgentHasSubjectAreaIterator.getHasSubjectArea());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

