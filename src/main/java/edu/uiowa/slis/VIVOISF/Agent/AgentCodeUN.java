package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentCodeUNIterator theAgent = (AgentCodeUNIterator)findAncestorWithClass(this, AgentCodeUNIterator.class);
			pageContext.getOut().print(theAgent.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

