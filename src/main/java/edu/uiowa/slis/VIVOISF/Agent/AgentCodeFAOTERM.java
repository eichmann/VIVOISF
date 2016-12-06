package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentCodeFAOTERMIterator theAgent = (AgentCodeFAOTERMIterator)findAncestorWithClass(this, AgentCodeFAOTERMIterator.class);
			pageContext.getOut().print(theAgent.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}

