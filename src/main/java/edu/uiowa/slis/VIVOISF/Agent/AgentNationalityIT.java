package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentNationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentNationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentNationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentNationalityITIterator theAgent = (AgentNationalityITIterator)findAncestorWithClass(this, AgentNationalityITIterator.class);
			pageContext.getOut().print(theAgent.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

