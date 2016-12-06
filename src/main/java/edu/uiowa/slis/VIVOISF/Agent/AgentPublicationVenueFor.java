package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentPublicationVenueFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentPublicationVenueFor currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentPublicationVenueFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentPublicationVenueForIterator theAgentPublicationVenueForIterator = (AgentPublicationVenueForIterator)findAncestorWithClass(this, AgentPublicationVenueForIterator.class);
			pageContext.getOut().print(theAgentPublicationVenueForIterator.getPublicationVenueFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

