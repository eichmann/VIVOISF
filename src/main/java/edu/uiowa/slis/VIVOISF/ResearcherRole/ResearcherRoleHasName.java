package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleHasName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleHasName currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleHasName.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleHasNameIterator theResearcherRoleHasNameIterator = (ResearcherRoleHasNameIterator)findAncestorWithClass(this, ResearcherRoleHasNameIterator.class);
			pageContext.getOut().print(theResearcherRoleHasNameIterator.getHasName());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for hasName tag ");
		}
		return SKIP_BODY;
	}
}

