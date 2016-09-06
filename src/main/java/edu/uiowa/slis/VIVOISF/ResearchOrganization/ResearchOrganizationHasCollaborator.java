package edu.uiowa.slis.VIVOISF.ResearchOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchOrganizationHasCollaborator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchOrganizationHasCollaborator currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchOrganizationHasCollaborator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchOrganizationHasCollaboratorIterator theResearchOrganizationHasCollaboratorIterator = (ResearchOrganizationHasCollaboratorIterator)findAncestorWithClass(this, ResearchOrganizationHasCollaboratorIterator.class);
			pageContext.getOut().print(theResearchOrganizationHasCollaboratorIterator.getHasCollaborator());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchOrganization for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchOrganization for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

