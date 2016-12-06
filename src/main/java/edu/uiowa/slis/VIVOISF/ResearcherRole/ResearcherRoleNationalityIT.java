package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleNationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleNationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleNationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleNationalityITIterator theResearcherRole = (ResearcherRoleNationalityITIterator)findAncestorWithClass(this, ResearcherRoleNationalityITIterator.class);
			pageContext.getOut().print(theResearcherRole.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

