package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentGDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentGDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentGDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentGDPTotalInCurrentPricesIterator theAgent = (AgentGDPTotalInCurrentPricesIterator)findAncestorWithClass(this, AgentGDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(theAgent.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

