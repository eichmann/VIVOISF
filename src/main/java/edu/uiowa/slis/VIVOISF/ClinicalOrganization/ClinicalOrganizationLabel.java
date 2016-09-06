package edu.uiowa.slis.VIVOISF.ClinicalOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalOrganizationLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalOrganizationLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalOrganizationLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ClinicalOrganization theClinicalOrganization = (ClinicalOrganization)findAncestorWithClass(this, ClinicalOrganization.class);
			if (!theClinicalOrganization.commitNeeded) {
				pageContext.getOut().print(theClinicalOrganization.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalOrganization for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalOrganization for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			ClinicalOrganization theClinicalOrganization = (ClinicalOrganization)findAncestorWithClass(this, ClinicalOrganization.class);
			return theClinicalOrganization.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing ClinicalOrganization for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalOrganization for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			ClinicalOrganization theClinicalOrganization = (ClinicalOrganization)findAncestorWithClass(this, ClinicalOrganization.class);
			theClinicalOrganization.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalOrganization for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalOrganization for label tag ");
		}
	}
}

