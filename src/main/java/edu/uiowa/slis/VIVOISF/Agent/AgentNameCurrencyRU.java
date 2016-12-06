package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentNameCurrencyRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentNameCurrencyRU currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentNameCurrencyRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentNameCurrencyRUIterator theAgent = (AgentNameCurrencyRUIterator)findAncestorWithClass(this, AgentNameCurrencyRUIterator.class);
			pageContext.getOut().print(theAgent.getNameCurrencyRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for nameCurrencyRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for nameCurrencyRU tag ");
		}
		return SKIP_BODY;
	}
}

