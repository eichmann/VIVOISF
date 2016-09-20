package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationHasCollaboratorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationHasCollaboratorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationHasCollaboratorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationHasCollaboratorInverseIterator theOrganizationHasCollaboratorInverseIterator = (OrganizationHasCollaboratorInverseIterator)findAncestorWithClass(this, OrganizationHasCollaboratorInverseIterator.class);
			pageContext.getOut().print(theOrganizationHasCollaboratorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

