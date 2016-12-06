package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentCountryAreaYearIterator theAgent = (AgentCountryAreaYearIterator)findAncestorWithClass(this, AgentCountryAreaYearIterator.class);
			pageContext.getOut().print(theAgent.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

