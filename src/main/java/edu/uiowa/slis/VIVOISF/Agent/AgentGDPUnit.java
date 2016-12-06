package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentGDPUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentGDPUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentGDPUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentGDPUnitIterator theAgent = (AgentGDPUnitIterator)findAncestorWithClass(this, AgentGDPUnitIterator.class);
			pageContext.getOut().print(theAgent.getGDPUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for GDPUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for GDPUnit tag ");
		}
		return SKIP_BODY;
	}
}

