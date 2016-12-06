package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentPopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentPopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentPopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentPopulationTotalIterator theAgent = (AgentPopulationTotalIterator)findAncestorWithClass(this, AgentPopulationTotalIterator.class);
			pageContext.getOut().print(theAgent.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

