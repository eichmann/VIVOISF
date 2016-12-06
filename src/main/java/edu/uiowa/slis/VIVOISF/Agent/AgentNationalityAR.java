package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentNationalityAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentNationalityAR currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentNationalityAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentNationalityARIterator theAgent = (AgentNationalityARIterator)findAncestorWithClass(this, AgentNationalityARIterator.class);
			pageContext.getOut().print(theAgent.getNationalityAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for nationalityAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for nationalityAR tag ");
		}
		return SKIP_BODY;
	}
}

