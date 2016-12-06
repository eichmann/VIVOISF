package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentAgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentAgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentAgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentAgriculturalAreaNotesIterator theAgent = (AgentAgriculturalAreaNotesIterator)findAncestorWithClass(this, AgentAgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(theAgent.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

