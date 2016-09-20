package edu.uiowa.slis.VIVOISF.ClinicalOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalOrganizationOBI_0000304Inverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalOrganizationOBI_0000304Inverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalOrganizationOBI_0000304Inverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalOrganizationOBI_0000304InverseIterator theClinicalOrganizationOBI_0000304InverseIterator = (ClinicalOrganizationOBI_0000304InverseIterator)findAncestorWithClass(this, ClinicalOrganizationOBI_0000304InverseIterator.class);
			pageContext.getOut().print(theClinicalOrganizationOBI_0000304InverseIterator.getOBI_0000304Inverse());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalOrganization for OBI_0000304 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalOrganization for OBI_0000304 tag ");
		}
		return SKIP_BODY;
	}
}

