package edu.uiowa.slis.VIVOISF.ClinicalOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalOrganizationERO_0001520Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalOrganizationERO_0001520Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalOrganizationERO_0001520Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalOrganizationERO_0001520Iterator theClinicalOrganizationERO_0001520Iterator = (ClinicalOrganizationERO_0001520Iterator)findAncestorWithClass(this, ClinicalOrganizationERO_0001520Iterator.class);
			pageContext.getOut().print(theClinicalOrganizationERO_0001520Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalOrganization for ERO_0001520 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalOrganization for ERO_0001520 tag ");
		}
		return SKIP_BODY;
	}
}

