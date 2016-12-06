package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleNationalityZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleNationalityZH currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleNationalityZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleNationalityZHIterator theResearcherRole = (ResearcherRoleNationalityZHIterator)findAncestorWithClass(this, ResearcherRoleNationalityZHIterator.class);
			pageContext.getOut().print(theResearcherRole.getNationalityZH());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for nationalityZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for nationalityZH tag ");
		}
		return SKIP_BODY;
	}
}

