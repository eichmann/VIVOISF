package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentNationalityRUIterator theAgent = (AgentNationalityRUIterator)findAncestorWithClass(this, AgentNationalityRUIterator.class);
			pageContext.getOut().print(theAgent.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

