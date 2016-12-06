package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentLandAreaYearIterator theAgent = (AgentLandAreaYearIterator)findAncestorWithClass(this, AgentLandAreaYearIterator.class);
			pageContext.getOut().print(theAgent.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

