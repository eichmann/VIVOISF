package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentHDITotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentHDITotal currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentHDITotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentHDITotalIterator theAgent = (AgentHDITotalIterator)findAncestorWithClass(this, AgentHDITotalIterator.class);
			pageContext.getOut().print(theAgent.getHDITotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for HDITotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for HDITotal tag ");
		}
		return SKIP_BODY;
	}
}

