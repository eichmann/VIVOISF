package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentHasMinLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentHasMinLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentHasMinLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentHasMinLatitudeIterator theAgent = (AgentHasMinLatitudeIterator)findAncestorWithClass(this, AgentHasMinLatitudeIterator.class);
			pageContext.getOut().print(theAgent.getHasMinLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for hasMinLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for hasMinLatitude tag ");
		}
		return SKIP_BODY;
	}
}

