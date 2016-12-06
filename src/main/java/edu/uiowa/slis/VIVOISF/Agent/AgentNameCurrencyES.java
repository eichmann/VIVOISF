package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentNameCurrencyESIterator theAgent = (AgentNameCurrencyESIterator)findAncestorWithClass(this, AgentNameCurrencyESIterator.class);
			pageContext.getOut().print(theAgent.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

