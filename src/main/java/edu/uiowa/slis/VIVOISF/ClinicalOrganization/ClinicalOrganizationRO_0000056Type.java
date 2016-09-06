package edu.uiowa.slis.VIVOISF.ClinicalOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalOrganizationRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalOrganizationRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalOrganizationRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalOrganizationRO_0000056Iterator theClinicalOrganizationRO_0000056Iterator = (ClinicalOrganizationRO_0000056Iterator)findAncestorWithClass(this, ClinicalOrganizationRO_0000056Iterator.class);
			pageContext.getOut().print(theClinicalOrganizationRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalOrganization for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalOrganization for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

