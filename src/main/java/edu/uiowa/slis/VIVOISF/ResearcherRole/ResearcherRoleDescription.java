package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleDescriptionIterator theResearcherRole = (ResearcherRoleDescriptionIterator)findAncestorWithClass(this, ResearcherRoleDescriptionIterator.class);
			pageContext.getOut().print(theResearcherRole.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for description tag ");
		}
		return SKIP_BODY;
	}
}

