package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentNameListESIterator theAgent = (AgentNameListESIterator)findAncestorWithClass(this, AgentNameListESIterator.class);
			pageContext.getOut().print(theAgent.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

