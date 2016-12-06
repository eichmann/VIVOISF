package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentNameListENIterator theAgent = (AgentNameListENIterator)findAncestorWithClass(this, AgentNameListENIterator.class);
			pageContext.getOut().print(theAgent.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

