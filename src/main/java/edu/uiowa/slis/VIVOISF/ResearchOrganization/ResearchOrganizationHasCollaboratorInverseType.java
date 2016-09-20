package edu.uiowa.slis.VIVOISF.ResearchOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchOrganizationHasCollaboratorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchOrganizationHasCollaboratorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchOrganizationHasCollaboratorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchOrganizationHasCollaboratorInverseIterator theResearchOrganizationHasCollaboratorInverseIterator = (ResearchOrganizationHasCollaboratorInverseIterator)findAncestorWithClass(this, ResearchOrganizationHasCollaboratorInverseIterator.class);
			pageContext.getOut().print(theResearchOrganizationHasCollaboratorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchOrganization for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchOrganization for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

