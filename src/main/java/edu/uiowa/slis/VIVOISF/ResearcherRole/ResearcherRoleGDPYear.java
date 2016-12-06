package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleGDPYearIterator theResearcherRole = (ResearcherRoleGDPYearIterator)findAncestorWithClass(this, ResearcherRoleGDPYearIterator.class);
			pageContext.getOut().print(theResearcherRole.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

