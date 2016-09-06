package edu.uiowa.slis.VIVOISF.ClinicalOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalOrganizationGoverningAuthorityForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalOrganizationGoverningAuthorityForType currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalOrganizationGoverningAuthorityForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalOrganizationGoverningAuthorityForIterator theClinicalOrganizationGoverningAuthorityForIterator = (ClinicalOrganizationGoverningAuthorityForIterator)findAncestorWithClass(this, ClinicalOrganizationGoverningAuthorityForIterator.class);
			pageContext.getOut().print(theClinicalOrganizationGoverningAuthorityForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalOrganization for governingAuthorityFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalOrganization for governingAuthorityFor tag ");
		}
		return SKIP_BODY;
	}
}

