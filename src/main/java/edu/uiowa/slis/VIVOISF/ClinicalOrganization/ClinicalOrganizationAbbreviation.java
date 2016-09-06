package edu.uiowa.slis.VIVOISF.ClinicalOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalOrganizationAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalOrganizationAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalOrganizationAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ClinicalOrganization theClinicalOrganization = (ClinicalOrganization)findAncestorWithClass(this, ClinicalOrganization.class);
			if (!theClinicalOrganization.commitNeeded) {
				pageContext.getOut().print(theClinicalOrganization.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalOrganization for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalOrganization for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			ClinicalOrganization theClinicalOrganization = (ClinicalOrganization)findAncestorWithClass(this, ClinicalOrganization.class);
			return theClinicalOrganization.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing ClinicalOrganization for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalOrganization for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			ClinicalOrganization theClinicalOrganization = (ClinicalOrganization)findAncestorWithClass(this, ClinicalOrganization.class);
			theClinicalOrganization.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalOrganization for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalOrganization for abbreviation tag ");
		}
	}
}

