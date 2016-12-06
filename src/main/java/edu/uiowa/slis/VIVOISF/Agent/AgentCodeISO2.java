package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentCodeISO2Iterator theAgent = (AgentCodeISO2Iterator)findAncestorWithClass(this, AgentCodeISO2Iterator.class);
			pageContext.getOut().print(theAgent.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}

