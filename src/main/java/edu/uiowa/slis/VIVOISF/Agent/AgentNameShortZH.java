package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentNameShortZHIterator theAgent = (AgentNameShortZHIterator)findAncestorWithClass(this, AgentNameShortZHIterator.class);
			pageContext.getOut().print(theAgent.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

