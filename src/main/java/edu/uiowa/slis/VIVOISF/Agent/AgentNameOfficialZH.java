package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentNameOfficialZHIterator theAgent = (AgentNameOfficialZHIterator)findAncestorWithClass(this, AgentNameOfficialZHIterator.class);
			pageContext.getOut().print(theAgent.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

