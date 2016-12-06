package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleNationalityES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleNationalityES currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleNationalityES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleNationalityESIterator theResearcherRole = (ResearcherRoleNationalityESIterator)findAncestorWithClass(this, ResearcherRoleNationalityESIterator.class);
			pageContext.getOut().print(theResearcherRole.getNationalityES());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for nationalityES tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for nationalityES tag ");
		}
		return SKIP_BODY;
	}
}

