package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentNameShortARIterator theAgent = (AgentNameShortARIterator)findAncestorWithClass(this, AgentNameShortARIterator.class);
			pageContext.getOut().print(theAgent.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

