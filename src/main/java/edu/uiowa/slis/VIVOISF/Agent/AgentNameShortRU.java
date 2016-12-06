package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentNameShortRUIterator theAgent = (AgentNameShortRUIterator)findAncestorWithClass(this, AgentNameShortRUIterator.class);
			pageContext.getOut().print(theAgent.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

