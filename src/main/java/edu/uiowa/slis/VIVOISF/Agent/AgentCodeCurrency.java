package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentCodeCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentCodeCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentCodeCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentCodeCurrencyIterator theAgent = (AgentCodeCurrencyIterator)findAncestorWithClass(this, AgentCodeCurrencyIterator.class);
			pageContext.getOut().print(theAgent.getCodeCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for codeCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for codeCurrency tag ");
		}
		return SKIP_BODY;
	}
}

