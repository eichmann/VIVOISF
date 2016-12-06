package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentNationalityES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentNationalityES currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentNationalityES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentNationalityESIterator theAgent = (AgentNationalityESIterator)findAncestorWithClass(this, AgentNationalityESIterator.class);
			pageContext.getOut().print(theAgent.getNationalityES());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for nationalityES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for nationalityES tag ");
		}
		return SKIP_BODY;
	}
}

