package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleHDIYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleHDIYear currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleHDIYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleHDIYearIterator theResearcherRole = (ResearcherRoleHDIYearIterator)findAncestorWithClass(this, ResearcherRoleHDIYearIterator.class);
			pageContext.getOut().print(theResearcherRole.getHDIYear());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for HDIYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for HDIYear tag ");
		}
		return SKIP_BODY;
	}
}

