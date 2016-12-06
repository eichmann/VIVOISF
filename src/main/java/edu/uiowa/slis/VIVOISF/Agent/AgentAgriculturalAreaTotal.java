package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentAgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentAgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentAgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentAgriculturalAreaTotalIterator theAgent = (AgentAgriculturalAreaTotalIterator)findAncestorWithClass(this, AgentAgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(theAgent.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

