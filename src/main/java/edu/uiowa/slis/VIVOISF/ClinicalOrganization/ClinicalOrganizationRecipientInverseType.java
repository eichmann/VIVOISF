package edu.uiowa.slis.VIVOISF.ClinicalOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalOrganizationRecipientInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalOrganizationRecipientInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalOrganizationRecipientInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalOrganizationRecipientInverseIterator theClinicalOrganizationRecipientInverseIterator = (ClinicalOrganizationRecipientInverseIterator)findAncestorWithClass(this, ClinicalOrganizationRecipientInverseIterator.class);
			pageContext.getOut().print(theClinicalOrganizationRecipientInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalOrganization for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalOrganization for recipient tag ");
		}
		return SKIP_BODY;
	}
}

