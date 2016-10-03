package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentSuffixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentSuffixName currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentSuffixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentSuffixNameIterator theAgent = (AgentSuffixNameIterator)findAncestorWithClass(this, AgentSuffixNameIterator.class);
			pageContext.getOut().print(theAgent.getSuffixName());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for suffixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for suffixName tag ");
		}
		return SKIP_BODY;
	}
}

