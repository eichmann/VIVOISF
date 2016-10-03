package edu.uiowa.slis.VIVOISF.ClinicalOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalOrganizationPrefixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalOrganizationPrefixName currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalOrganizationPrefixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ClinicalOrganizationPrefixNameIterator theClinicalOrganization = (ClinicalOrganizationPrefixNameIterator)findAncestorWithClass(this, ClinicalOrganizationPrefixNameIterator.class);
			pageContext.getOut().print(theClinicalOrganization.getPrefixName());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalOrganization for prefixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalOrganization for prefixName tag ");
		}
		return SKIP_BODY;
	}
}

