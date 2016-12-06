package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentHasPublicationVenue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentHasPublicationVenue currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentHasPublicationVenue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentHasPublicationVenueIterator theAgentHasPublicationVenueIterator = (AgentHasPublicationVenueIterator)findAncestorWithClass(this, AgentHasPublicationVenueIterator.class);
			pageContext.getOut().print(theAgentHasPublicationVenueIterator.getHasPublicationVenue());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}
