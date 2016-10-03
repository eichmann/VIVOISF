package edu.uiowa.slis.VIVOISF.ClinicalOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalOrganizationDirectorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalOrganizationDirectorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalOrganizationDirectorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalOrganizationDirectorInverseIterator theClinicalOrganizationDirectorInverseIterator = (ClinicalOrganizationDirectorInverseIterator)findAncestorWithClass(this, ClinicalOrganizationDirectorInverseIterator.class);
			pageContext.getOut().print(theClinicalOrganizationDirectorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalOrganization for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalOrganization for director tag ");
		}
		return SKIP_BODY;
	}
}

