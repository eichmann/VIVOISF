package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentNameOfficialARIterator theAgent = (AgentNameOfficialARIterator)findAncestorWithClass(this, AgentNameOfficialARIterator.class);
			pageContext.getOut().print(theAgent.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

