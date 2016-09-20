package edu.uiowa.slis.VIVOISF.ClinicalOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalOrganizationIssuerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalOrganizationIssuerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalOrganizationIssuerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalOrganizationIssuerInverseIterator theClinicalOrganizationIssuerInverseIterator = (ClinicalOrganizationIssuerInverseIterator)findAncestorWithClass(this, ClinicalOrganizationIssuerInverseIterator.class);
			pageContext.getOut().print(theClinicalOrganizationIssuerInverseIterator.getIssuerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalOrganization for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalOrganization for issuer tag ");
		}
		return SKIP_BODY;
	}
}

