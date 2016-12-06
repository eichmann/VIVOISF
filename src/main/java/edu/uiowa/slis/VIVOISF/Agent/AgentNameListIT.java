package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentNameListITIterator theAgent = (AgentNameListITIterator)findAncestorWithClass(this, AgentNameListITIterator.class);
			pageContext.getOut().print(theAgent.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

