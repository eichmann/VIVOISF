package edu.uiowa.slis.VIVOISF.ClinicalOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalOrganizationRecipientInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalOrganizationRecipientInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalOrganizationRecipientInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalOrganizationRecipientInverseIterator theClinicalOrganizationRecipientInverseIterator = (ClinicalOrganizationRecipientInverseIterator)findAncestorWithClass(this, ClinicalOrganizationRecipientInverseIterator.class);
			pageContext.getOut().print(theClinicalOrganizationRecipientInverseIterator.getRecipientInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalOrganization for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalOrganization for recipient tag ");
		}
		return SKIP_BODY;
	}
}

