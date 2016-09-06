package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Agent theAgent = (Agent)findAncestorWithClass(this, Agent.class);
			if (!theAgent.commitNeeded) {
				pageContext.getOut().print(theAgent.getOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for overview tag ");
		}
		return SKIP_BODY;
	}

	public String getOverview() throws JspTagException {
		try {
			Agent theAgent = (Agent)findAncestorWithClass(this, Agent.class);
			return theAgent.getOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing Agent for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for overview tag ");
		}
	}

	public void setOverview(String overview) throws JspTagException {
		try {
			Agent theAgent = (Agent)findAncestorWithClass(this, Agent.class);
			theAgent.setOverview(overview);
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for overview tag ");
		}
	}
}

