package edu.uiowa.slis.VIVOISF.ClinicalOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalOrganizationERO_0000037Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalOrganizationERO_0000037Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalOrganizationERO_0000037Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalOrganizationERO_0000037Iterator theClinicalOrganizationERO_0000037Iterator = (ClinicalOrganizationERO_0000037Iterator)findAncestorWithClass(this, ClinicalOrganizationERO_0000037Iterator.class);
			pageContext.getOut().print(theClinicalOrganizationERO_0000037Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalOrganization for ERO_0000037 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalOrganization for ERO_0000037 tag ");
		}
		return SKIP_BODY;
	}
}

