package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleNationalityFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleNationalityFR currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleNationalityFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleNationalityFRIterator theResearcherRole = (ResearcherRoleNationalityFRIterator)findAncestorWithClass(this, ResearcherRoleNationalityFRIterator.class);
			pageContext.getOut().print(theResearcherRole.getNationalityFR());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for nationalityFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for nationalityFR tag ");
		}
		return SKIP_BODY;
	}
}

