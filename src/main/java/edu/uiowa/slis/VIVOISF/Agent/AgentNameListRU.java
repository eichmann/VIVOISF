package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentNameListRUIterator theAgent = (AgentNameListRUIterator)findAncestorWithClass(this, AgentNameListRUIterator.class);
			pageContext.getOut().print(theAgent.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

