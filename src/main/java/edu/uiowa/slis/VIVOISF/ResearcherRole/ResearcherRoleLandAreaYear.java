package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleLandAreaYearIterator theResearcherRole = (ResearcherRoleLandAreaYearIterator)findAncestorWithClass(this, ResearcherRoleLandAreaYearIterator.class);
			pageContext.getOut().print(theResearcherRole.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

