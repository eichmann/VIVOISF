package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentFreetextKeywordIterator theAgent = (AgentFreetextKeywordIterator)findAncestorWithClass(this, AgentFreetextKeywordIterator.class);
			pageContext.getOut().print(theAgent.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

