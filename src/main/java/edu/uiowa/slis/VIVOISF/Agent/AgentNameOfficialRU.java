package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentNameOfficialRUIterator theAgent = (AgentNameOfficialRUIterator)findAncestorWithClass(this, AgentNameOfficialRUIterator.class);
			pageContext.getOut().print(theAgent.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

