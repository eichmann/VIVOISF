package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentDateTimeInterval extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentDateTimeInterval currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentDateTimeInterval.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentDateTimeIntervalIterator theAgentDateTimeIntervalIterator = (AgentDateTimeIntervalIterator)findAncestorWithClass(this, AgentDateTimeIntervalIterator.class);
			pageContext.getOut().print(theAgentDateTimeIntervalIterator.getDateTimeInterval());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

