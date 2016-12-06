package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentNationalityFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentNationalityFR currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentNationalityFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentNationalityFRIterator theAgent = (AgentNationalityFRIterator)findAncestorWithClass(this, AgentNationalityFRIterator.class);
			pageContext.getOut().print(theAgent.getNationalityFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for nationalityFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for nationalityFR tag ");
		}
		return SKIP_BODY;
	}
}

