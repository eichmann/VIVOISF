package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Agent theAgent = (Agent)findAncestorWithClass(this, Agent.class);
			if (!theAgent.commitNeeded) {
				pageContext.getOut().print(theAgent.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			Agent theAgent = (Agent)findAncestorWithClass(this, Agent.class);
			return theAgent.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing Agent for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			Agent theAgent = (Agent)findAncestorWithClass(this, Agent.class);
			theAgent.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for abbreviation tag ");
		}
	}
}

