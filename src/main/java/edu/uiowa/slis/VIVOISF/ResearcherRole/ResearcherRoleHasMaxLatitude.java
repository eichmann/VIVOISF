package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleHasMaxLatitudeIterator theResearcherRole = (ResearcherRoleHasMaxLatitudeIterator)findAncestorWithClass(this, ResearcherRoleHasMaxLatitudeIterator.class);
			pageContext.getOut().print(theResearcherRole.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

