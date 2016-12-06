package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentHasMinLongitudeIterator theAgent = (AgentHasMinLongitudeIterator)findAncestorWithClass(this, AgentHasMinLongitudeIterator.class);
			pageContext.getOut().print(theAgent.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

