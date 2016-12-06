package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentGDPYearIterator theAgent = (AgentGDPYearIterator)findAncestorWithClass(this, AgentGDPYearIterator.class);
			pageContext.getOut().print(theAgent.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

