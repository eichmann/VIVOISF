package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentNameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentNameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentNameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentNameCurrencyENIterator theAgent = (AgentNameCurrencyENIterator)findAncestorWithClass(this, AgentNameCurrencyENIterator.class);
			pageContext.getOut().print(theAgent.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}

