package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleNationalityRUIterator theResearcherRole = (ResearcherRoleNationalityRUIterator)findAncestorWithClass(this, ResearcherRoleNationalityRUIterator.class);
			pageContext.getOut().print(theResearcherRole.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

