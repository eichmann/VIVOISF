package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentGDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentGDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentGDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentGDPNotesIterator theAgent = (AgentGDPNotesIterator)findAncestorWithClass(this, AgentGDPNotesIterator.class);
			pageContext.getOut().print(theAgent.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}

