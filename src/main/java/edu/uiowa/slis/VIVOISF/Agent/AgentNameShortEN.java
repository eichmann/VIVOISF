package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentNameShortENIterator theAgent = (AgentNameShortENIterator)findAncestorWithClass(this, AgentNameShortENIterator.class);
			pageContext.getOut().print(theAgent.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

