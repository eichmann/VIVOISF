package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentPopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentPopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentPopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentPopulationUnitIterator theAgent = (AgentPopulationUnitIterator)findAncestorWithClass(this, AgentPopulationUnitIterator.class);
			pageContext.getOut().print(theAgent.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

