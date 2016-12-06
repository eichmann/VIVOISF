package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentNameOfficialESIterator theAgent = (AgentNameOfficialESIterator)findAncestorWithClass(this, AgentNameOfficialESIterator.class);
			pageContext.getOut().print(theAgent.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

