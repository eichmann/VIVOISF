package edu.uiowa.slis.VIVOISF.ClinicalOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalOrganizationIssuerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalOrganizationIssuerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalOrganizationIssuerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalOrganizationIssuerInverseIterator theClinicalOrganizationIssuerInverseIterator = (ClinicalOrganizationIssuerInverseIterator)findAncestorWithClass(this, ClinicalOrganizationIssuerInverseIterator.class);
			pageContext.getOut().print(theClinicalOrganizationIssuerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalOrganization for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalOrganization for issuer tag ");
		}
		return SKIP_BODY;
	}
}

