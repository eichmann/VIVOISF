package edu.uiowa.slis.VIVOISF.ClinicalOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalOrganizationERO_0000031 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalOrganizationERO_0000031 currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalOrganizationERO_0000031.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalOrganizationERO_0000031Iterator theClinicalOrganizationERO_0000031Iterator = (ClinicalOrganizationERO_0000031Iterator)findAncestorWithClass(this, ClinicalOrganizationERO_0000031Iterator.class);
			pageContext.getOut().print(theClinicalOrganizationERO_0000031Iterator.getERO_0000031());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalOrganization for ERO_0000031 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalOrganization for ERO_0000031 tag ");
		}
		return SKIP_BODY;
	}
}

