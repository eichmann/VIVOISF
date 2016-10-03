package edu.uiowa.slis.VIVOISF.ClinicalOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalOrganizationCourtInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalOrganizationCourtInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalOrganizationCourtInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalOrganizationCourtInverseIterator theClinicalOrganizationCourtInverseIterator = (ClinicalOrganizationCourtInverseIterator)findAncestorWithClass(this, ClinicalOrganizationCourtInverseIterator.class);
			pageContext.getOut().print(theClinicalOrganizationCourtInverseIterator.getCourtInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalOrganization for court tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalOrganization for court tag ");
		}
		return SKIP_BODY;
	}
}
