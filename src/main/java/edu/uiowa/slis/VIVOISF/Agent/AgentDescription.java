package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentDescriptionIterator theAgent = (AgentDescriptionIterator)findAncestorWithClass(this, AgentDescriptionIterator.class);
			pageContext.getOut().print(theAgent.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for description tag ");
		}
		return SKIP_BODY;
	}
}

