package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentNameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentNameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentNameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentNameCurrencyFRIterator theAgent = (AgentNameCurrencyFRIterator)findAncestorWithClass(this, AgentNameCurrencyFRIterator.class);
			pageContext.getOut().print(theAgent.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

