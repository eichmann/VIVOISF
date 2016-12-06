package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentLandAreaUnitIterator theAgent = (AgentLandAreaUnitIterator)findAncestorWithClass(this, AgentLandAreaUnitIterator.class);
			pageContext.getOut().print(theAgent.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

