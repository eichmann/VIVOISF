package edu.uiowa.slis.VIVOISF.ClinicalOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalOrganizationSuffixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalOrganizationSuffixName currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalOrganizationSuffixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ClinicalOrganizationSuffixNameIterator theClinicalOrganization = (ClinicalOrganizationSuffixNameIterator)findAncestorWithClass(this, ClinicalOrganizationSuffixNameIterator.class);
			pageContext.getOut().print(theClinicalOrganization.getSuffixName());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalOrganization for suffixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalOrganization for suffixName tag ");
		}
		return SKIP_BODY;
	}
}

