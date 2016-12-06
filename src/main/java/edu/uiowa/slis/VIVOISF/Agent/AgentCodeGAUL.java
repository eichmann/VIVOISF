package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentCodeGAUL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentCodeGAUL currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentCodeGAUL.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentCodeGAULIterator theAgent = (AgentCodeGAULIterator)findAncestorWithClass(this, AgentCodeGAULIterator.class);
			pageContext.getOut().print(theAgent.getCodeGAUL());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for codeGAUL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for codeGAUL tag ");
		}
		return SKIP_BODY;
	}
}

