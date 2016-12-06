package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentNameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentNameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentNameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentNameCurrencyARIterator theAgent = (AgentNameCurrencyARIterator)findAncestorWithClass(this, AgentNameCurrencyARIterator.class);
			pageContext.getOut().print(theAgent.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

