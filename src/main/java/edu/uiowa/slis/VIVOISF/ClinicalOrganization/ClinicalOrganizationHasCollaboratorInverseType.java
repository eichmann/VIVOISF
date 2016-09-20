package edu.uiowa.slis.VIVOISF.ClinicalOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalOrganizationHasCollaboratorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalOrganizationHasCollaboratorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalOrganizationHasCollaboratorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalOrganizationHasCollaboratorInverseIterator theClinicalOrganizationHasCollaboratorInverseIterator = (ClinicalOrganizationHasCollaboratorInverseIterator)findAncestorWithClass(this, ClinicalOrganizationHasCollaboratorInverseIterator.class);
			pageContext.getOut().print(theClinicalOrganizationHasCollaboratorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalOrganization for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalOrganization for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

