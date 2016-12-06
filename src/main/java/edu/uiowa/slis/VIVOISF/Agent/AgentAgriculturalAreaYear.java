package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentAgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentAgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentAgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentAgriculturalAreaYearIterator theAgent = (AgentAgriculturalAreaYearIterator)findAncestorWithClass(this, AgentAgriculturalAreaYearIterator.class);
			pageContext.getOut().print(theAgent.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

