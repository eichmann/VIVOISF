package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentPopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentPopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentPopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentPopulationNotesIterator theAgent = (AgentPopulationNotesIterator)findAncestorWithClass(this, AgentPopulationNotesIterator.class);
			pageContext.getOut().print(theAgent.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}

