package edu.uiowa.slis.VIVOISF.ClinicalOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalOrganizationRO_0000053 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalOrganizationRO_0000053 currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalOrganizationRO_0000053.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalOrganizationRO_0000053Iterator theClinicalOrganizationRO_0000053Iterator = (ClinicalOrganizationRO_0000053Iterator)findAncestorWithClass(this, ClinicalOrganizationRO_0000053Iterator.class);
			pageContext.getOut().print(theClinicalOrganizationRO_0000053Iterator.getRO_0000053());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalOrganization for RO_0000053 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalOrganization for RO_0000053 tag ");
		}
		return SKIP_BODY;
	}
}

