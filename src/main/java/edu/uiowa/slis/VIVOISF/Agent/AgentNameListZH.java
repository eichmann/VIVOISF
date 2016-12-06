package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentNameListZHIterator theAgent = (AgentNameListZHIterator)findAncestorWithClass(this, AgentNameListZHIterator.class);
			pageContext.getOut().print(theAgent.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

