package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentNameListARIterator theAgent = (AgentNameListARIterator)findAncestorWithClass(this, AgentNameListARIterator.class);
			pageContext.getOut().print(theAgent.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

