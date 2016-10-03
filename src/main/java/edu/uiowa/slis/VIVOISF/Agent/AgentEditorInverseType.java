package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentEditorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentEditorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentEditorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentEditorInverseIterator theAgentEditorInverseIterator = (AgentEditorInverseIterator)findAncestorWithClass(this, AgentEditorInverseIterator.class);
			pageContext.getOut().print(theAgentEditorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for editor tag ");
		}
		return SKIP_BODY;
	}
}

