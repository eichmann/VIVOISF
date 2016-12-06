package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleNationalityEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleNationalityEN currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleNationalityEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleNationalityENIterator theResearcherRole = (ResearcherRoleNationalityENIterator)findAncestorWithClass(this, ResearcherRoleNationalityENIterator.class);
			pageContext.getOut().print(theResearcherRole.getNationalityEN());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for nationalityEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for nationalityEN tag ");
		}
		return SKIP_BODY;
	}
}

