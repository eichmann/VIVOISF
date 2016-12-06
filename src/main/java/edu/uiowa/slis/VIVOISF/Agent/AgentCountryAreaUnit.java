package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentCountryAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentCountryAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentCountryAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentCountryAreaUnitIterator theAgent = (AgentCountryAreaUnitIterator)findAncestorWithClass(this, AgentCountryAreaUnitIterator.class);
			pageContext.getOut().print(theAgent.getCountryAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for countryAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for countryAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

