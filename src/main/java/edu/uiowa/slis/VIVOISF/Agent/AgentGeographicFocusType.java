package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentGeographicFocusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentGeographicFocusType currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentGeographicFocusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentGeographicFocusIterator theAgentGeographicFocusIterator = (AgentGeographicFocusIterator)findAncestorWithClass(this, AgentGeographicFocusIterator.class);
			pageContext.getOut().print(theAgentGeographicFocusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

