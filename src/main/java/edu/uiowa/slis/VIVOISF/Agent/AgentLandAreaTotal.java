package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentLandAreaTotalIterator theAgent = (AgentLandAreaTotalIterator)findAncestorWithClass(this, AgentLandAreaTotalIterator.class);
			pageContext.getOut().print(theAgent.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

