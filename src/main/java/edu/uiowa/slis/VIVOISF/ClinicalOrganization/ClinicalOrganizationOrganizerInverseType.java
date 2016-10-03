package edu.uiowa.slis.VIVOISF.ClinicalOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalOrganizationOrganizerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalOrganizationOrganizerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalOrganizationOrganizerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalOrganizationOrganizerInverseIterator theClinicalOrganizationOrganizerInverseIterator = (ClinicalOrganizationOrganizerInverseIterator)findAncestorWithClass(this, ClinicalOrganizationOrganizerInverseIterator.class);
			pageContext.getOut().print(theClinicalOrganizationOrganizerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalOrganization for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalOrganization for organizer tag ");
		}
		return SKIP_BODY;
	}
}

