package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentNameOfficialITIterator theAgent = (AgentNameOfficialITIterator)findAncestorWithClass(this, AgentNameOfficialITIterator.class);
			pageContext.getOut().print(theAgent.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

