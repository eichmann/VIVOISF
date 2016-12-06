package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentPopulationYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentPopulationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentPopulationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentPopulationYearIterator theAgent = (AgentPopulationYearIterator)findAncestorWithClass(this, AgentPopulationYearIterator.class);
			pageContext.getOut().print(theAgent.getPopulationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for populationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for populationYear tag ");
		}
		return SKIP_BODY;
	}
}

