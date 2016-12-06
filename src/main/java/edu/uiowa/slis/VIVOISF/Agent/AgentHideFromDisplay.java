package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentHideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentHideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentHideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Agent theAgent = (Agent)findAncestorWithClass(this, Agent.class);
			if (!theAgent.commitNeeded) {
				pageContext.getOut().print(theAgent.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			Agent theAgent = (Agent)findAncestorWithClass(this, Agent.class);
			return theAgent.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing Agent for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			Agent theAgent = (Agent)findAncestorWithClass(this, Agent.class);
			theAgent.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for hideFromDisplay tag ");
		}
	}
}

