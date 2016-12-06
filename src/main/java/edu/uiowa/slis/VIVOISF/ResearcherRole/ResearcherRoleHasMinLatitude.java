package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleHasMinLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleHasMinLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleHasMinLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleHasMinLatitudeIterator theResearcherRole = (ResearcherRoleHasMinLatitudeIterator)findAncestorWithClass(this, ResearcherRoleHasMinLatitudeIterator.class);
			pageContext.getOut().print(theResearcherRole.getHasMinLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for hasMinLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for hasMinLatitude tag ");
		}
		return SKIP_BODY;
	}
}

