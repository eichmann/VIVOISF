package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentNationalityZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentNationalityZH currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentNationalityZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentNationalityZHIterator theAgent = (AgentNationalityZHIterator)findAncestorWithClass(this, AgentNationalityZHIterator.class);
			pageContext.getOut().print(theAgent.getNationalityZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for nationalityZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for nationalityZH tag ");
		}
		return SKIP_BODY;
	}
}

