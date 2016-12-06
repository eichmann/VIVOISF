package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentNationalityEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentNationalityEN currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentNationalityEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentNationalityENIterator theAgent = (AgentNationalityENIterator)findAncestorWithClass(this, AgentNationalityENIterator.class);
			pageContext.getOut().print(theAgent.getNationalityEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for nationalityEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for nationalityEN tag ");
		}
		return SKIP_BODY;
	}
}

