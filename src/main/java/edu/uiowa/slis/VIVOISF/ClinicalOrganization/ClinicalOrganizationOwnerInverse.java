package edu.uiowa.slis.VIVOISF.ClinicalOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalOrganizationOwnerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalOrganizationOwnerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalOrganizationOwnerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalOrganizationOwnerInverseIterator theClinicalOrganizationOwnerInverseIterator = (ClinicalOrganizationOwnerInverseIterator)findAncestorWithClass(this, ClinicalOrganizationOwnerInverseIterator.class);
			pageContext.getOut().print(theClinicalOrganizationOwnerInverseIterator.getOwnerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalOrganization for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalOrganization for owner tag ");
		}
		return SKIP_BODY;
	}
}

