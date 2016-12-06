package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentNameOfficialENIterator theAgent = (AgentNameOfficialENIterator)findAncestorWithClass(this, AgentNameOfficialENIterator.class);
			pageContext.getOut().print(theAgent.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

