package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentHDIYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentHDIYear currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentHDIYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentHDIYearIterator theAgent = (AgentHDIYearIterator)findAncestorWithClass(this, AgentHDIYearIterator.class);
			pageContext.getOut().print(theAgent.getHDIYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for HDIYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for HDIYear tag ");
		}
		return SKIP_BODY;
	}
}

