package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentNameShortFRIterator theAgent = (AgentNameShortFRIterator)findAncestorWithClass(this, AgentNameShortFRIterator.class);
			pageContext.getOut().print(theAgent.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

