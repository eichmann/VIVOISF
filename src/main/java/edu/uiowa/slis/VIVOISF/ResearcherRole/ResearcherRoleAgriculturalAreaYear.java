package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleAgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleAgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleAgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleAgriculturalAreaYearIterator theResearcherRole = (ResearcherRoleAgriculturalAreaYearIterator)findAncestorWithClass(this, ResearcherRoleAgriculturalAreaYearIterator.class);
			pageContext.getOut().print(theResearcherRole.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

