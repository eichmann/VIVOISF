package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentAgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentAgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentAgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentAgriculturalAreaUnitIterator theAgent = (AgentAgriculturalAreaUnitIterator)findAncestorWithClass(this, AgentAgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(theAgent.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

