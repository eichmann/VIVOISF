package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentCodeISO3Iterator theAgent = (AgentCodeISO3Iterator)findAncestorWithClass(this, AgentCodeISO3Iterator.class);
			pageContext.getOut().print(theAgent.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}

