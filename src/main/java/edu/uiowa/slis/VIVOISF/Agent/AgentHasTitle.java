package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentHasTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentHasTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentHasTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentHasTitleIterator theAgentHasTitleIterator = (AgentHasTitleIterator)findAncestorWithClass(this, AgentHasTitleIterator.class);
			pageContext.getOut().print(theAgentHasTitleIterator.getHasTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

