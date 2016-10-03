package edu.uiowa.slis.VIVOISF.ClinicalOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalOrganizationPerformerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalOrganizationPerformerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalOrganizationPerformerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalOrganizationPerformerInverseIterator theClinicalOrganizationPerformerInverseIterator = (ClinicalOrganizationPerformerInverseIterator)findAncestorWithClass(this, ClinicalOrganizationPerformerInverseIterator.class);
			pageContext.getOut().print(theClinicalOrganizationPerformerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalOrganization for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalOrganization for performer tag ");
		}
		return SKIP_BODY;
	}
}

