package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentUrlIterator theAgent = (AgentUrlIterator)findAncestorWithClass(this, AgentUrlIterator.class);
			pageContext.getOut().print(theAgent.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for url tag ");
		}
		return SKIP_BODY;
	}
}

