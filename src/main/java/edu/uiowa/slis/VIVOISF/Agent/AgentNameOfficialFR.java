package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentNameOfficialFRIterator theAgent = (AgentNameOfficialFRIterator)findAncestorWithClass(this, AgentNameOfficialFRIterator.class);
			pageContext.getOut().print(theAgent.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

