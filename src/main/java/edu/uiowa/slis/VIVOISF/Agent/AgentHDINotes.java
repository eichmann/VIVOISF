package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentHDINotesIterator theAgent = (AgentHDINotesIterator)findAncestorWithClass(this, AgentHDINotesIterator.class);
			pageContext.getOut().print(theAgent.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

