package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentLandAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentLandAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentLandAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentLandAreaNotesIterator theAgent = (AgentLandAreaNotesIterator)findAncestorWithClass(this, AgentLandAreaNotesIterator.class);
			pageContext.getOut().print(theAgent.getLandAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for landAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for landAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

