package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleRelatesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleRelatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleRelatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleRelatesIterator theResearcherRoleRelatesIterator = (ResearcherRoleRelatesIterator)findAncestorWithClass(this, ResearcherRoleRelatesIterator.class);
			pageContext.getOut().print(theResearcherRoleRelatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for relates tag ");
		}
		return SKIP_BODY;
	}
}

