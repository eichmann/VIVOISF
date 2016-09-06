package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentTranslatorOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentTranslatorOf currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentTranslatorOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentTranslatorOfIterator theAgentTranslatorOfIterator = (AgentTranslatorOfIterator)findAncestorWithClass(this, AgentTranslatorOfIterator.class);
			pageContext.getOut().print(theAgentTranslatorOfIterator.getTranslatorOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for translatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for translatorOf tag ");
		}
		return SKIP_BODY;
	}
}

