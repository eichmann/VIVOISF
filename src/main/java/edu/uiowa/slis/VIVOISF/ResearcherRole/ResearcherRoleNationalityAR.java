package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleNationalityAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleNationalityAR currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleNationalityAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleNationalityARIterator theResearcherRole = (ResearcherRoleNationalityARIterator)findAncestorWithClass(this, ResearcherRoleNationalityARIterator.class);
			pageContext.getOut().print(theResearcherRole.getNationalityAR());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for nationalityAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for nationalityAR tag ");
		}
		return SKIP_BODY;
	}
}

