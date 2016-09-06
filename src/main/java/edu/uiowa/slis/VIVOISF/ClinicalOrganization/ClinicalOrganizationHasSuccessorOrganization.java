package edu.uiowa.slis.VIVOISF.ClinicalOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalOrganizationHasSuccessorOrganization extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalOrganizationHasSuccessorOrganization currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalOrganizationHasSuccessorOrganization.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalOrganizationHasSuccessorOrganizationIterator theClinicalOrganizationHasSuccessorOrganizationIterator = (ClinicalOrganizationHasSuccessorOrganizationIterator)findAncestorWithClass(this, ClinicalOrganizationHasSuccessorOrganizationIterator.class);
			pageContext.getOut().print(theClinicalOrganizationHasSuccessorOrganizationIterator.getHasSuccessorOrganization());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalOrganization for hasSuccessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalOrganization for hasSuccessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

