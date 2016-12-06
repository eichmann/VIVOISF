package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentDateTimeValue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentDateTimeValue currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentDateTimeValue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentDateTimeValueIterator theAgentDateTimeValueIterator = (AgentDateTimeValueIterator)findAncestorWithClass(this, AgentDateTimeValueIterator.class);
			pageContext.getOut().print(theAgentDateTimeValueIterator.getDateTimeValue());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

