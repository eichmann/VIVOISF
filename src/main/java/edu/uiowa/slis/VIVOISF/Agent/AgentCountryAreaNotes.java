package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentCountryAreaNotesIterator theAgent = (AgentCountryAreaNotesIterator)findAncestorWithClass(this, AgentCountryAreaNotesIterator.class);
			pageContext.getOut().print(theAgent.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

