package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentNameShortESIterator theAgent = (AgentNameShortESIterator)findAncestorWithClass(this, AgentNameShortESIterator.class);
			pageContext.getOut().print(theAgent.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

