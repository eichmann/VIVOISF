package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentCodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentCodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentCodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentCodeDBPediaIDIterator theAgent = (AgentCodeDBPediaIDIterator)findAncestorWithClass(this, AgentCodeDBPediaIDIterator.class);
			pageContext.getOut().print(theAgent.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

