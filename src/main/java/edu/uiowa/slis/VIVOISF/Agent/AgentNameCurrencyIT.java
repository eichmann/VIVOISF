package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentNameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentNameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentNameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentNameCurrencyITIterator theAgent = (AgentNameCurrencyITIterator)findAncestorWithClass(this, AgentNameCurrencyITIterator.class);
			pageContext.getOut().print(theAgent.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

