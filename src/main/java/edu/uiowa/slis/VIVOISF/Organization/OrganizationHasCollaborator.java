package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationHasCollaborator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationHasCollaborator currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationHasCollaborator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationHasCollaboratorIterator theOrganizationHasCollaboratorIterator = (OrganizationHasCollaboratorIterator)findAncestorWithClass(this, OrganizationHasCollaboratorIterator.class);
			pageContext.getOut().print(theOrganizationHasCollaboratorIterator.getHasCollaborator());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

