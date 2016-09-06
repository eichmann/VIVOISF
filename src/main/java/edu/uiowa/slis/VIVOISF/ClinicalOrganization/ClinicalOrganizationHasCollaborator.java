package edu.uiowa.slis.VIVOISF.ClinicalOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalOrganizationHasCollaborator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalOrganizationHasCollaborator currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalOrganizationHasCollaborator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalOrganizationHasCollaboratorIterator theClinicalOrganizationHasCollaboratorIterator = (ClinicalOrganizationHasCollaboratorIterator)findAncestorWithClass(this, ClinicalOrganizationHasCollaboratorIterator.class);
			pageContext.getOut().print(theClinicalOrganizationHasCollaboratorIterator.getHasCollaborator());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalOrganization for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalOrganization for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

